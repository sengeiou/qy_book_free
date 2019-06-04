package com.wy.adbook.di.component;

import com.jess.arms.base.BaseFragment_MembersInjector;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.integration.IRepositoryManager;
import com.wy.adbook.di.module.WalletItemModule;
import com.wy.adbook.di.module.WalletItemModule_ProvideAboutModelFactory;
import com.wy.adbook.di.module.WalletItemModule_ProvideAboutViewFactory;
import com.wy.adbook.mvp.contranct.WalletItemContract;
import com.wy.adbook.mvp.model.WalletItemModel;
import com.wy.adbook.mvp.model.WalletItemModel_Factory;
import com.wy.adbook.mvp.presenter.WalletItemPresenter;
import com.wy.adbook.mvp.presenter.WalletItemPresenter_Factory;
import com.wy.adbook.mvp.view.fragment.WalletItemFragment;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerWalletItemComponent implements WalletItemComponent {
  private com_jess_arms_di_component_AppComponent_repositoryManager repositoryManagerProvider;

  private Provider<WalletItemModel> walletItemModelProvider;

  private Provider<WalletItemContract.Model> provideAboutModelProvider;

  private Provider<WalletItemContract.View> provideAboutViewProvider;

  private com_jess_arms_di_component_AppComponent_rxErrorHandler rxErrorHandlerProvider;

  private Provider<WalletItemPresenter> walletItemPresenterProvider;

  private DaggerWalletItemComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.repositoryManagerProvider =
        new com_jess_arms_di_component_AppComponent_repositoryManager(builder.appComponent);
    this.walletItemModelProvider =
        DoubleCheck.provider(WalletItemModel_Factory.create(repositoryManagerProvider));
    this.provideAboutModelProvider =
        DoubleCheck.provider(
            WalletItemModule_ProvideAboutModelFactory.create(
                builder.walletItemModule, walletItemModelProvider));
    this.provideAboutViewProvider =
        DoubleCheck.provider(
            WalletItemModule_ProvideAboutViewFactory.create(builder.walletItemModule));
    this.rxErrorHandlerProvider =
        new com_jess_arms_di_component_AppComponent_rxErrorHandler(builder.appComponent);
    this.walletItemPresenterProvider =
        DoubleCheck.provider(
            WalletItemPresenter_Factory.create(
                provideAboutModelProvider, provideAboutViewProvider, rxErrorHandlerProvider));
  }

  @Override
  public void inject(WalletItemFragment inject) {
    injectWalletItemFragment(inject);
  }

  private WalletItemFragment injectWalletItemFragment(WalletItemFragment instance) {
    BaseFragment_MembersInjector.injectMPresenter(instance, walletItemPresenterProvider.get());
    return instance;
  }

  public static final class Builder {
    private WalletItemModule walletItemModule;

    private AppComponent appComponent;

    private Builder() {}

    public WalletItemComponent build() {
      if (walletItemModule == null) {
        throw new IllegalStateException(WalletItemModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerWalletItemComponent(this);
    }

    public Builder walletItemModule(WalletItemModule walletItemModule) {
      this.walletItemModule = Preconditions.checkNotNull(walletItemModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }

  private static class com_jess_arms_di_component_AppComponent_repositoryManager
      implements Provider<IRepositoryManager> {
    private final AppComponent appComponent;

    com_jess_arms_di_component_AppComponent_repositoryManager(AppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public IRepositoryManager get() {
      return Preconditions.checkNotNull(
          appComponent.repositoryManager(),
          "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class com_jess_arms_di_component_AppComponent_rxErrorHandler
      implements Provider<RxErrorHandler> {
    private final AppComponent appComponent;

    com_jess_arms_di_component_AppComponent_rxErrorHandler(AppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public RxErrorHandler get() {
      return Preconditions.checkNotNull(
          appComponent.rxErrorHandler(),
          "Cannot return null from a non-@Nullable component method");
    }
  }
}