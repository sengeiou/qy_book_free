package com.wy.adbook.mvp.presenter;

import java.lang.System;

/**
 * * Created by leafye on 2019/4/30.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u000200J\u0006\u00102\u001a\u000200J\u0006\u00103\u001a\u000200J\u0006\u00104\u001a\u000200J\u0006\u00105\u001a\u000200J\u0006\u00106\u001a\u000200J\u0006\u00107\u001a\u000200J\u0006\u00108\u001a\u000200J\u0006\u00109\u001a\u000200J\u0006\u0010:\u001a\u000200J\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<J\u000e\u0010>\u001a\u0002002\u0006\u0010?\u001a\u00020@J\b\u0010A\u001a\u000200H\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0013\u0010\nR\u001b\u0010\u0015\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0016\u0010\nR\u001b\u0010\u0018\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u0019\u0010\nR\u001b\u0010\u001b\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001c\u0010\nR\u001b\u0010\u001e\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b\u001f\u0010\nR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b$\u0010\nR\u001b\u0010&\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b\'\u0010\nR\u001b\u0010)\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010\f\u001a\u0004\b*\u0010\nR\u001b\u0010,\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b-\u0010\n\u00a8\u0006B"}, d2 = {"Lcom/wy/adbook/mvp/presenter/MyPresenter;", "Lcom/wy/adbook/app/base/QYBasePresenter;", "Lcom/wy/adbook/mvp/contranct/MyContract$Model;", "Lcom/wy/adbook/mvp/contranct/MyContract$View;", "model", "view", "(Lcom/wy/adbook/mvp/contranct/MyContract$Model;Lcom/wy/adbook/mvp/contranct/MyContract$View;)V", "friends", "Lcom/wy/adbook/mvp/view/adapter/MyNormalItem;", "getFriends", "()Lcom/wy/adbook/mvp/view/adapter/MyNormalItem;", "friends$delegate", "Lkotlin/Lazy;", "headerItem", "Lcom/wy/adbook/mvp/view/adapter/MyHeaderItem;", "getHeaderItem", "()Lcom/wy/adbook/mvp/view/adapter/MyHeaderItem;", "headerItem$delegate", "helpCenter", "getHelpCenter", "helpCenter$delegate", "inviteToCash", "getInviteToCash", "inviteToCash$delegate", "membershipBenefits", "getMembershipBenefits", "membershipBenefits$delegate", "msg", "getMsg", "msg$delegate", "myWallet", "getMyWallet", "myWallet$delegate", "personalCenterPage", "Lcom/wy/adbook/mvp/model/entity/accout/PersonalCenterPage;", "readFootprint", "getReadFootprint", "readFootprint$delegate", "redEnvelopesForCode", "getRedEnvelopesForCode", "redEnvelopesForCode$delegate", "systemSetting", "getSystemSetting", "systemSetting$delegate", "wantToWithdraw", "getWantToWithdraw", "wantToWithdraw$delegate", "enterHelpCenter", "", "enterInviteFriends", "enterMembershipRenefits", "enterMsg", "enterMyFriends", "enterMyWallet", "enterReadFootprint", "enterRedEnvelopesForCode", "enterSysSetting", "enterWantWithDraw", "fetchData", "getMyItemList", "", "Lcom/wy/adbook/mvp/view/adapter/MyItem;", "loginWx", "code", "", "requestUserInfo", "application_release"})
@com.jess.arms.di.scope.FragmentScope()
public final class MyPresenter extends com.wy.adbook.app.base.QYBasePresenter<com.wy.adbook.mvp.contranct.MyContract.Model, com.wy.adbook.mvp.contranct.MyContract.View> {
    private final kotlin.Lazy headerItem$delegate = null;
    private final kotlin.Lazy inviteToCash$delegate = null;
    private final kotlin.Lazy redEnvelopesForCode$delegate = null;
    private final kotlin.Lazy readFootprint$delegate = null;
    private final kotlin.Lazy msg$delegate = null;
    private final kotlin.Lazy friends$delegate = null;
    private final kotlin.Lazy membershipBenefits$delegate = null;
    private final kotlin.Lazy wantToWithdraw$delegate = null;
    private final kotlin.Lazy myWallet$delegate = null;
    private final kotlin.Lazy helpCenter$delegate = null;
    private final kotlin.Lazy systemSetting$delegate = null;
    private com.wy.adbook.mvp.model.entity.accout.PersonalCenterPage personalCenterPage;
    
    private final com.wy.adbook.mvp.view.adapter.MyHeaderItem getHeaderItem() {
        return null;
    }
    
    private final com.wy.adbook.mvp.view.adapter.MyNormalItem getInviteToCash() {
        return null;
    }
    
    private final com.wy.adbook.mvp.view.adapter.MyNormalItem getRedEnvelopesForCode() {
        return null;
    }
    
    private final com.wy.adbook.mvp.view.adapter.MyNormalItem getReadFootprint() {
        return null;
    }
    
    private final com.wy.adbook.mvp.view.adapter.MyNormalItem getMsg() {
        return null;
    }
    
    private final com.wy.adbook.mvp.view.adapter.MyNormalItem getFriends() {
        return null;
    }
    
    private final com.wy.adbook.mvp.view.adapter.MyNormalItem getMembershipBenefits() {
        return null;
    }
    
    private final com.wy.adbook.mvp.view.adapter.MyNormalItem getWantToWithdraw() {
        return null;
    }
    
    private final com.wy.adbook.mvp.view.adapter.MyNormalItem getMyWallet() {
        return null;
    }
    
    private final com.wy.adbook.mvp.view.adapter.MyNormalItem getHelpCenter() {
        return null;
    }
    
    private final com.wy.adbook.mvp.view.adapter.MyNormalItem getSystemSetting() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.wy.adbook.mvp.view.adapter.MyItem> getMyItemList() {
        return null;
    }
    
    public final void enterInviteFriends() {
    }
    
    public final void enterMyWallet() {
    }
    
    /**
     * * 我要提现
     */
    public final void enterWantWithDraw() {
    }
    
    /**
     * * 会员福利
     */
    public final void enterMembershipRenefits() {
    }
    
    /**
     * * 我的好友
     */
    public final void enterMyFriends() {
    }
    
    /**
     * * 消息中心
     */
    public final void enterMsg() {
    }
    
    /**
     * * 阅读足迹
     */
    public final void enterReadFootprint() {
    }
    
    /**
     * * 红包码兑换
     */
    public final void enterRedEnvelopesForCode() {
    }
    
    /**
     * * 帮助中心
     */
    public final void enterHelpCenter() {
    }
    
    /**
     * * 设置中心
     */
    public final void enterSysSetting() {
    }
    
    public final void fetchData() {
    }
    
    private final void requestUserInfo() {
    }
    
    public final void loginWx(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
    }
    
    @javax.inject.Inject()
    public MyPresenter(@org.jetbrains.annotations.NotNull()
    com.wy.adbook.mvp.contranct.MyContract.Model model, @org.jetbrains.annotations.NotNull()
    com.wy.adbook.mvp.contranct.MyContract.View view) {
        super(null, null);
    }
}