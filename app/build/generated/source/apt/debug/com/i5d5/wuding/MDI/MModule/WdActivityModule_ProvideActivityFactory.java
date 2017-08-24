// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.i5d5.wuding.MDI.MModule;

import android.app.Activity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class WdActivityModule_ProvideActivityFactory implements Factory<Activity> {
  private final WdActivityModule module;

  public WdActivityModule_ProvideActivityFactory(WdActivityModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Activity get() {
    return Preconditions.checkNotNull(
        module.provideActivity(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Activity> create(WdActivityModule module) {
    return new WdActivityModule_ProvideActivityFactory(module);
  }

  /** Proxies {@link WdActivityModule#provideActivity()}. */
  public static Activity proxyProvideActivity(WdActivityModule instance) {
    return instance.provideActivity();
  }
}