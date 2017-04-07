package com.i5d5.wuding.MDI.MComponent;

import com.i5d5.basemodule.DI.Component.ApplicationComponent;
import com.i5d5.basemodule.DI.Scop.PerActivity;
import com.i5d5.wuding.MDI.MModule.WdActivityModule;
import com.i5d5.wuding.MDI.Scop.WdMainScop;

import dagger.Component;

/**
 * class_name: WdActivityComponent
 * package_name: com.i5d5.wuding.MDI.MComponent
 * acthor: lucheng
 * time: 2017/3/29 10:32
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {WdActivityModule.class})
public interface WdActivityComponent {
    WdClassComponent wdClassComponent();
    WdStoreComponent wdStoreComponent();
}
