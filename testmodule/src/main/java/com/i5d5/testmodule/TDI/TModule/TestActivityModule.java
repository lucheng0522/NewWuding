package com.i5d5.testmodule.TDI.TModule;

import android.app.Activity;
import android.content.Context;

import com.i5d5.basemodule.DI.Qualifier.ActivityContext;
import com.i5d5.basemodule.DI.Scop.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * class_name: TestActivityModule
 * package_name: com.i5d5.testmodule.TDI.TModule
 * acthor: lucheng
 * time: 2017/3/31 9:23
 */
@Module
public class TestActivityModule {
    private Activity activity;

    public TestActivityModule(Activity activity) {
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
}
