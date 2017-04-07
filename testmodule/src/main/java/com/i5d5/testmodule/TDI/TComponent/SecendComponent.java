package com.i5d5.testmodule.TDI.TComponent;

import com.i5d5.testmodule.TDI.Scop.TestScop;
import com.i5d5.testmodule.TDI.TModule.SecendModule;
import com.i5d5.testmodule.TEST.View.Activity.SecendActivity;

import dagger.Subcomponent;

/**
 * class_name: SecendComponent
 * package_name: com.i5d5.testmodule.TDI.TComponent
 * acthor: lucheng
 * time: 2017/3/31 9:38
 */
@TestScop
@Subcomponent(modules = SecendModule.class)
public interface SecendComponent {
    void inject(SecendActivity secendActivity);
}
