package com.i5d5.wuding.MDI.MComponent;

import com.i5d5.wuding.MDI.MModule.ClassModule;
import com.i5d5.wuding.MDI.Scop.WdMainScop;
import com.i5d5.wuding.WD.View.Activity.ClassActivity;

import dagger.Subcomponent;

/**
 * class_name: WdClassComponent
 * package_name: com.i5d5.wuding.MDI.MComponent
 * acthor: lucheng
 * time: 2017/3/29 10:35
 */
@WdMainScop
@Subcomponent(modules = ClassModule.class)
public interface WdClassComponent {
    void inject(ClassActivity classActivity);
}
