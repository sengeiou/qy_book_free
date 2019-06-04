package com.wy.xdroidmvp.net;


import android.text.TextUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by wanglei on 2016/12/24.
 */

public class XApi {
    private static NetProvider sProvider = null;

    private Map<String, NetProvider> providerMap = new HashMap<>();
    private Map<String, Retrofit> retrofitMap = new HashMap<>();
    private Map<String, OkHttpClient> clientMap = new HashMap<>();

    public static final long connectTimeoutMills = 40 * 1000l;
    public static final long readTimeoutMills = 180 * 1000l;

    private static XApi instance;

    private XApi() {

    }

    public static XApi getInstance() {
        if (instance == null) {
            synchronized (XApi.class) {
                if (instance == null) {
                    instance = new XApi();
                }
            }
        }
        return instance;
    }


    public static void registerProvider(NetProvider provider) {
        XApi.sProvider = provider;
    }

    public static void registerProvider(String baseUrl, NetProvider provider) {
        getInstance().providerMap.put(baseUrl, provider);
    }


    public Retrofit getRetrofit(String baseUrl, boolean useRx, List<Interceptor> its) {
        return getRetrofit(baseUrl, null, useRx, its);
    }


    public Retrofit getRetrofit(String baseUrl, NetProvider provider, boolean useRx, List<Interceptor> its) {
        if (TextUtils.isEmpty(baseUrl)) {
            throw new IllegalStateException("baseUrl can not be null");
        }
        if (retrofitMap.get(baseUrl) != null) return retrofitMap.get(baseUrl);

        if (provider == null) {
            provider = providerMap.get(baseUrl);
            if (provider == null) {
                provider = sProvider;
            }
        }
        checkProvider(provider);

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(getClient(baseUrl, provider, its))
                //增加返回值为string的支持
                .addConverterFactory(ScalarsConverterFactory.create())
                //增加返回值为Gson的支持(以实体类返回)
                .addConverterFactory(GsonConverterFactory.create());
        if (useRx) {
            //增加返回值为Oservable<T>的支持
            builder.addCallAdapterFactory(RxJavaCallAdapterFactory.create());
        }

        Retrofit retrofit = builder.build();
        retrofitMap.put(baseUrl, retrofit);
        providerMap.put(baseUrl, provider);

        return retrofit;
    }

    private OkHttpClient getClient(String baseUrl, NetProvider provider, List<Interceptor> its) {
        if (TextUtils.isEmpty(baseUrl)) {
            throw new IllegalStateException("baseUrl can not be null");
        }
        if (clientMap.get(baseUrl) != null) return clientMap.get(baseUrl);

        checkProvider(provider);

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.retryOnConnectionFailure(true);
        if (com.wy.core.BuildConfig.LOG_ENABLE) {
            LogInterceptor loggingInterceptor = new LogInterceptor();
            builder.addInterceptor(loggingInterceptor);
        }

        builder.connectTimeout(provider.configConnectTimeoutMills() != 0
                ? provider.configConnectTimeoutMills()
                : connectTimeoutMills, TimeUnit.MILLISECONDS);
        builder.readTimeout(provider.configReadTimeoutMills() != 0
                ? provider.configReadTimeoutMills() : readTimeoutMills, TimeUnit.MILLISECONDS);

        CookieJar cookieJar = provider.configCookie();
        if (cookieJar != null) {
            builder.cookieJar(cookieJar);
        }
        provider.configHttps(builder);

        RequestHandler handler = provider.configHandler();
        if (handler != null) {
            builder.addInterceptor(new XInterceptor(handler));
        }

        Interceptor[] interceptors = provider.configInterceptors();
        if (interceptors != null && interceptors.length > 0) {
            for (Interceptor interceptor : interceptors) {
                builder.addInterceptor(interceptor);
            }
        }

        if (its != null && its.size() > 0) {
            for (Interceptor interceptor : its) {
                builder.addInterceptor(interceptor);
            }
        }

        OkHttpClient client = builder.build();
        clientMap.put(baseUrl, client);
        providerMap.put(baseUrl, provider);

        return client;
    }


    private void checkProvider(NetProvider provider) {
        if (provider == null) {
            throw new IllegalStateException("must register provider first");
        }
    }

    public static NetProvider getCommonProvider() {
        return sProvider;
    }

    public Map<String, Retrofit> getRetrofitMap() {
        return retrofitMap;
    }

    public Map<String, OkHttpClient> getClientMap() {
        return clientMap;
    }

    public static void clearCache() {
        getInstance().retrofitMap.clear();
        getInstance().clientMap.clear();
    }

    /**
     * 线程切换
     *
     * @return
     */
    public static <T extends IModel> Observable.Transformer<T, ? extends T> getScheduler() {
        Observable.Transformer<T, ? extends T> transformer = new Observable.Transformer<T, T>() {
            @Override
            public Observable<T> call(Observable<T> observable) {
                return observable.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
        return transformer;
    }

    /**
     * 异常处理变换
     *
     * @return
     */
    public static <T extends IModel> Observable.Transformer<T, ? extends T> getApiTransformer() {
        Observable.Transformer<T, ? extends T> transformer = new Observable.Transformer<T, T>() {
            @Override
            public Observable<T> call(Observable<T> observable) {

                return observable.flatMap(new Func1<T, Observable<T>>() {
                    @Override
                    public Observable<T> call(T model) {
                        if (model == null || model.isNull()) {
                            return Observable.error(new NetError(model.getErrorMsg(), NetError.NoDataError));
                        } else if (model.isAuthError()) {
                            return Observable.error(new NetError(model.getErrorMsg(), NetError.AuthError));
                        } else if (model.isBizError()) {
                            return Observable.error(new NetError(model.getErrorMsg(), NetError.BusinessError));
                        } else {
                            return Observable.just(model);
                        }
                    }

                });
            }
        };
        return transformer;
    }


}
