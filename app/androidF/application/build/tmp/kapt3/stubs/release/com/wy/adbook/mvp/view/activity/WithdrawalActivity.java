package com.wy.adbook.mvp.view.activity;

import java.lang.System;

/**
 * * Created by leafye on 2019-05-26.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016\u00a8\u0006\u0012"}, d2 = {"Lcom/wy/adbook/mvp/view/activity/WithdrawalActivity;", "Lcom/wy/adbook/app/base/QYBaseActivity;", "Lcom/wy/adbook/mvp/presenter/WithdrawalPresenter;", "Lcom/wy/adbook/mvp/contranct/WithdrawalContract$View;", "()V", "getToolbar", "Landroid/view/View;", "initData", "", "savedInstanceState", "Landroid/os/Bundle;", "initListener", "initView", "", "setupActivityComponent", "appComponent", "Lcom/jess/arms/di/component/AppComponent;", "Companion", "application_release"})
public final class WithdrawalActivity extends com.wy.adbook.app.base.QYBaseActivity<com.wy.adbook.mvp.presenter.WithdrawalPresenter> implements com.wy.adbook.mvp.contranct.WithdrawalContract.View {
    public static final com.wy.adbook.mvp.view.activity.WithdrawalActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void setupActivityComponent(@org.jetbrains.annotations.NotNull()
    com.jess.arms.di.component.AppComponent appComponent) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View getToolbar() {
        return null;
    }
    
    @java.lang.Override()
    public int initView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return 0;
    }
    
    @java.lang.Override()
    public void initData(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initListener() {
    }
    
    public WithdrawalActivity() {
        super();
    }
    
    public static final void startActivity(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/wy/adbook/mvp/view/activity/WithdrawalActivity$Companion;", "", "()V", "startActivity", "", "context", "Landroid/content/Context;", "application_release"})
    public static final class Companion {
        
        public final void startActivity(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private Companion() {
            super();
        }
    }
}