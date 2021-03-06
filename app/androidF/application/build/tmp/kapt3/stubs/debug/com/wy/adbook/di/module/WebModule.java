package com.wy.adbook.di.module;

import java.lang.System;

/**
 * * Created by leafye on 2019-05-23.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/wy/adbook/di/module/WebModule;", "", "view", "Lcom/wy/adbook/mvp/view/web/act/WebContract$View;", "(Lcom/wy/adbook/mvp/view/web/act/WebContract$View;)V", "provideAboutModel", "Lcom/wy/adbook/mvp/view/web/act/WebContract$Model;", "model", "Lcom/wy/adbook/mvp/view/web/act/WebModel;", "provideAboutView", "application_debug"})
@dagger.Module()
public final class WebModule {
    private final com.wy.adbook.mvp.view.web.act.WebContract.View view = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.jess.arms.di.scope.ActivityScope()
    public final com.wy.adbook.mvp.view.web.act.WebContract.View provideAboutView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.jess.arms.di.scope.ActivityScope()
    public final com.wy.adbook.mvp.view.web.act.WebContract.Model provideAboutModel(@org.jetbrains.annotations.NotNull()
    com.wy.adbook.mvp.view.web.act.WebModel model) {
        return null;
    }
    
    public WebModule(@org.jetbrains.annotations.NotNull()
    com.wy.adbook.mvp.view.web.act.WebContract.View view) {
        super();
    }
}