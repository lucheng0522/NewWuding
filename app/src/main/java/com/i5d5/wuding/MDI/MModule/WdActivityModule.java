package com.i5d5.wuding.MDI.MModule;

import android.app.Activity;
import android.content.Context;

import com.i5d5.basemodule.DI.Qualifier.ActivityContext;
import com.i5d5.basemodule.DI.Scop.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * class_name: WdActivityModule
 * package_name: com.i5d5.wuding.MDI.MModule
 * acthor: lucheng
 * time: 2017/3/29 10:32
 */
@Module
public class WdActivityModule {
    private Activity activity;

    public WdActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    Activity provideActivity() {
        return activity;
    }

    @Provides
    @PerActivity
    @ActivityContext
    Context provideContext() {
        return activity;
    }

    @Provides
    @PerActivity
    ClassModule provideClassModule() {
        return new ClassModule();
    }

}
