package com.freebookqy.application.app.base;

import android.app.Service;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by leafye on 2019-05-15.
 */
public abstract class BaseService extends Service {

    private CompositeDisposable mDisposable;

    protected void addDisposable(Disposable disposable){
        if (mDisposable == null){
            mDisposable = new CompositeDisposable();
        }
        mDisposable.add(disposable);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mDisposable != null){
            mDisposable.dispose();
        }
    }
}
