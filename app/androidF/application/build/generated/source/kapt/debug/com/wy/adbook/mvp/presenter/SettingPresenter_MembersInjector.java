package com.wy.adbook.mvp.presenter;

import com.wy.adbook.app.base.QYBasePresenter_MembersInjector;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SettingPresenter_MembersInjector implements MembersInjector<SettingPresenter> {
  private final Provider<RxErrorHandler> mErrorHandlerProvider;

  public SettingPresenter_MembersInjector(Provider<RxErrorHandler> mErrorHandlerProvider) {
    this.mErrorHandlerProvider = mErrorHandlerProvider;
  }

  public static MembersInjector<SettingPresenter> create(
      Provider<RxErrorHandler> mErrorHandlerProvider) {
    return new SettingPresenter_MembersInjector(mErrorHandlerProvider);
  }

  @Override
  public void injectMembers(SettingPresenter instance) {
    QYBasePresenter_MembersInjector.injectMErrorHandler(instance, mErrorHandlerProvider.get());
  }
}
