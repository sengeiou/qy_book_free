package com.wy.adbook.mvp.model;

import java.lang.System;

/**
 * * Created by leafye on 2019-05-28.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J.\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/wy/adbook/mvp/model/WalletItemModel;", "Lcom/jess/arms/mvp/BaseModel;", "Lcom/wy/adbook/mvp/contranct/WalletItemContract$Model;", "repositoryManager", "Lcom/jess/arms/integration/IRepositoryManager;", "(Lcom/jess/arms/integration/IRepositoryManager;)V", "accountFLowPage", "Lio/reactivex/Observable;", "Lcom/wy/adbook/mvp/model/entity/accout/NetFlowPage;", "cuId", "", "currencyType", "", "pageNo", "pageSize", "application_debug"})
@com.jess.arms.di.scope.FragmentScope()
public final class WalletItemModel extends com.jess.arms.mvp.BaseModel implements com.wy.adbook.mvp.contranct.WalletItemContract.Model {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.wy.adbook.mvp.model.entity.accout.NetFlowPage> accountFLowPage(int cuId, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyType, int pageNo, int pageSize) {
        return null;
    }
    
    @javax.inject.Inject()
    public WalletItemModel(@org.jetbrains.annotations.NotNull()
    com.jess.arms.integration.IRepositoryManager repositoryManager) {
        super(null);
    }
}