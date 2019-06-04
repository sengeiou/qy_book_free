package com.wy.core.utils;

import android.util.Log;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 单例模式实现, 可以这样调用:<br/>
 * <code>LoginModule login = Singlton.getInstance(LoginModule.class);</code><br/>
 * LoginModule必须实现一个没有参数的构造函数: <br/>
 * <code><pre>
 * public LoginModule(){
 * .....
 * }</pre></code> 对于已经存在的实例, 可以这样做:<br/>
 * <code><pre>
 * Application:
 *    void onCreate(...){
 *        Singlton.setInstance(this);
 *    }
 * </pre></code> 对于带参数的, 可以这样做:<br/>
 * <code><pre>
 * public NetModule(String ip, intface port){...}
 *
 * NetModule netModule = new NetModule("123.456.7.8", 90);
 * Singlton.setInstance(netModule);
 * </pre></code>
 *
 */
public class Singlton {

    private interface InsanceFactory<T> {
        T createInstance();
    }

    private static Map<Object, Object> all = new ConcurrentHashMap<Object, Object>(32);

    /**
     * 单例的简单变种实现 给一个类型, 返回一个实例, 如果这个实例以前没有创建过, 则会使用默认的构造函数创建一个实例.
     *
     * @param <T>
     * @param cls
     * @return
     */
    public static <T> T getInstance(Class<T> cls) {
        return getInstance(cls, cls, null);
    }

    /**
     * 工厂支持
     *
     * @param <T>
     * @param superCls
     *            父类/抽象类或接口
     * @param objCls
     *            子类或实现类
     * @return 返回父类/抽象类或接口
     */
    public static <T> T getInstance(Class<T> superCls, Class<? extends T> objCls) {
        return getInstance(superCls, objCls, null);
    }
    public static <T> T getInstance(Class<T> objCls, InsanceFactory<T> instanceFactory) {
        return getInstance(objCls, objCls, instanceFactory);
    }

    /**
     * 支持工厂的单例
     *
     * @param <T>
     * @param superCls
     *            父类/抽象类或接口
     * @param objCls
     *            子类或实现类
     * @params instEvent
     *            创建实例时的回调
     * @return 返回父类/抽象类或接口
     */
    @SuppressWarnings("unchecked")
    public static <T> T getInstance(Class<T> superCls, Class<? extends T> objCls, InsanceFactory<T> instanceFactory) {
        Object obj = all.get(superCls);
        if (obj == null) {
            synchronized (superCls) {
                if (obj == null) {
                    try {
                        if (instanceFactory != null) {
                            obj = instanceFactory.createInstance();
                        } else {
                            obj = objCls.newInstance();
                        }
                        all.put(superCls, obj);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return (T) obj;
    }

    /**
     * 设置一个实例, 下次可以通过getInstance来获取
     * getIntance(Class class)直接构造一个没有参数的构造方法，即默认的构造方法,有时候创建一个对象需要传入一个参数，所以提供了此方法
     * 例子
     * CommonInterface commonInterface = new CommonInterface(Context mContext);
     * 设置一个单例对象
     * setInstance(commonInterface);
     * 获取一个单例对象
     * getInstance(CommonInterface.class)
     * @param <T>
     * @param obj
     */
    synchronized public static <T> void setInstance(T obj) {
        assert (obj != null);
        if (obj != null) {
            all.put(obj.getClass(), obj);
        }
    }

    synchronized public static <T> void removeInstance(Class<T> cls) {
        all.remove(cls);
    }

    synchronized public static <T> void removeAll() {
        all.clear();
    }

    /**
     * 工厂模式支持
     *
     * @param <T>
     * @param superCls
     *            接口类型/抽象类/父类
     * @param obj
     *            实例/子类
     */
    synchronized public static <T> void setInstance(Class<? super T> superCls, T obj) {
        assert (obj != null && superCls != null);
        if (superCls != null && obj != null) {
            all.put(superCls, obj);
        }
    }

}