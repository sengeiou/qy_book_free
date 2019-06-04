package com.wy.adbook.di.module;

import com.wy.adbook.mvp.contranct.ReadContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReadModule_ProvideAboutViewFactory implements Factory<ReadContract.View> {
  private final ReadModule module;

  public ReadModule_ProvideAboutViewFactory(ReadModule module) {
    this.module = module;
  }

  @Override
  public ReadContract.View get() {
    return Preconditions.checkNotNull(
        module.provideAboutView(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ReadModule_ProvideAboutViewFactory create(ReadModule module) {
    return new ReadModule_ProvideAboutViewFactory(module);
  }

  public static ReadContract.View proxyProvideAboutView(ReadModule instance) {
    return Preconditions.checkNotNull(
        instance.provideAboutView(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
