package com.wy.adbook.di.module;

import android.support.v7.widget.LinearLayoutManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SignCalenderModule_ProvideLayoutManager1$application_releaseFactory
    implements Factory<LinearLayoutManager> {
  private final SignCalenderModule module;

  public SignCalenderModule_ProvideLayoutManager1$application_releaseFactory(
      SignCalenderModule module) {
    this.module = module;
  }

  @Override
  public LinearLayoutManager get() {
    return Preconditions.checkNotNull(
        module.provideLayoutManager1$application_release(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static SignCalenderModule_ProvideLayoutManager1$application_releaseFactory create(
      SignCalenderModule module) {
    return new SignCalenderModule_ProvideLayoutManager1$application_releaseFactory(module);
  }

  public static LinearLayoutManager proxyProvideLayoutManager1$application_release(
      SignCalenderModule instance) {
    return Preconditions.checkNotNull(
        instance.provideLayoutManager1$application_release(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}