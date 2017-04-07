package com.i5d5.testmodule.TDI.TComponent;

import com.i5d5.basemodule.DI.Component.ApplicationComponent;
import com.i5d5.basemodule.DI.Scop.PerActivity;
import com.i5d5.testmodule.TDI.TModule.TestActivityModule;

import dagger.Component;

/**
 * class_name: TestActivityComponent
 * package_name: com.i5d5.testmodule.TDI.TComponent
 * acthor: lucheng
 * time: 2017/3/31 9:23
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = TestActivityModule.class)
public interface TestActivityComponent {
    SecendComponent secendComponent();
}
