package com.wy.adbook.di.module;

import java.lang.System;

/**
 * * Created by leafye on 2019/4/29.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007J\r\u0010\n\u001a\u00020\u000bH\u0001\u00a2\u0006\u0002\b\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/wy/adbook/di/module/MainModule;", "", "view", "Lcom/wy/adbook/mvp/contranct/MainContract$View;", "(Lcom/wy/adbook/mvp/contranct/MainContract$View;)V", "provideAboutModel", "Lcom/wy/adbook/mvp/contranct/MainContract$Model;", "model", "Lcom/wy/adbook/mvp/model/MainModel;", "provideAboutView", "provideWarningDialog", "Lcom/wy/adbook/dialog/WarningDialog;", "provideWarningDialog$application_debug", "application_debug"})
@dagger.Module()
public final class MainModule {
    private final com.wy.adbook.mvp.contranct.MainContract.View view = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.jess.arms.di.scope.ActivityScope()
    public final com.wy.adbook.mvp.contranct.MainContract.View provideAboutView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.jess.arms.di.scope.ActivityScope()
    public final com.wy.adbook.mvp.contranct.MainContract.Model provideAboutModel(@org.jetbrains.annotations.NotNull()
    com.wy.adbook.mvp.model.MainModel model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.jess.arms.di.scope.ActivityScope()
    public final com.wy.adbook.dialog.WarningDialog provideWarningDialog$application_debug() {
        return null;
    }
    
    public MainModule(@org.jetbrains.annotations.NotNull()
    com.wy.adbook.mvp.contranct.MainContract.View view) {
        super();
    }
}