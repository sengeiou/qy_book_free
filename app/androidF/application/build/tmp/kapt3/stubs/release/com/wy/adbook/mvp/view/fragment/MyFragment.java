package com.wy.adbook.mvp.view.fragment;

import java.lang.System;

/**
 * * Created by leafye on 2019/4/30.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \'2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0002J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J\u0012\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\fH\u0014J\u0010\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020%H\u0007J\b\u0010&\u001a\u00020\u001cH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006("}, d2 = {"Lcom/wy/adbook/mvp/view/fragment/MyFragment;", "Lcom/wy/adbook/app/base/QYBaseFragment;", "Lcom/wy/adbook/mvp/presenter/MyPresenter;", "Lcom/wy/adbook/mvp/contranct/MyContract$View;", "()V", "myAdapter", "Lcom/wy/adbook/mvp/view/adapter/MyAdapter;", "getMyAdapter", "()Lcom/wy/adbook/mvp/view/adapter/MyAdapter;", "myAdapter$delegate", "Lkotlin/Lazy;", "initData", "", "savedInstanceState", "Landroid/os/Bundle;", "initListener", "initView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "refreshView", "setData", "data", "", "setRefresh", "isRefresh", "", "setupFragmentComponent", "appComponent", "Lcom/jess/arms/di/component/AppComponent;", "startInitView", "subscribeLoginEvent", "event", "Lcom/wy/adbook/mvp/model/event/LoginEvent;", "subscribeWxEvent", "Lcom/wy/adbook/wxapi/WXEntryActivity$WxEventBusKey;", "useEventBus", "Companion", "application_release"})
public final class MyFragment extends com.wy.adbook.app.base.QYBaseFragment<com.wy.adbook.mvp.presenter.MyPresenter> implements com.wy.adbook.mvp.contranct.MyContract.View {
    private final kotlin.Lazy myAdapter$delegate = null;
    public static final com.wy.adbook.mvp.view.fragment.MyFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public boolean useEventBus() {
        return false;
    }
    
    @java.lang.Override()
    public void setupFragmentComponent(@org.jetbrains.annotations.NotNull()
    com.jess.arms.di.component.AppComponent appComponent) {
    }
    
    @java.lang.Override()
    public void initData(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void setData(@org.jetbrains.annotations.Nullable()
    java.lang.Object data) {
    }
    
    private final com.wy.adbook.mvp.view.adapter.MyAdapter getMyAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void startInitView() {
    }
    
    private final void initListener() {
    }
    
    @java.lang.Override()
    public void refreshView() {
    }
    
    @java.lang.Override()
    public void setRefresh(boolean isRefresh) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View initView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.simple.eventbus.Subscriber(mode = org.simple.eventbus.ThreadMode.MAIN)
    public final void subscribeLoginEvent(@org.jetbrains.annotations.NotNull()
    com.wy.adbook.mvp.model.event.LoginEvent event) {
    }
    
    @org.simple.eventbus.Subscriber(mode = org.simple.eventbus.ThreadMode.MAIN)
    public final void subscribeWxEvent(@org.jetbrains.annotations.NotNull()
    com.wy.adbook.wxapi.WXEntryActivity.WxEventBusKey event) {
    }
    
    public MyFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/wy/adbook/mvp/view/fragment/MyFragment$Companion;", "", "()V", "newInstance", "Lcom/wy/adbook/mvp/view/fragment/MyFragment;", "application_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.wy.adbook.mvp.view.fragment.MyFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}