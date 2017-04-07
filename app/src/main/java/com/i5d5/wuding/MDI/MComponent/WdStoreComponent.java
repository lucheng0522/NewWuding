package com.i5d5.wuding.MDI.MComponent;

import com.i5d5.wuding.MDI.Scop.WdMainScop;
import com.i5d5.wuding.WD.View.Activity.MainActivity;

import dagger.Subcomponent;

/**
 * class_name: WdStoreComponent
 * package_name: com.i5d5.wuding.MDI.MComponent
 * acthor: lucheng
 * time: 2017/3/29 11:39
 */
@WdMainScop
@Subcomponent()
public interface WdStoreComponent {
    void inject(MainActivity mainActivity);
}
