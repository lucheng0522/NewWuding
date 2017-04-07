package com.i5d5.basemodule.DI.Module;

import android.app.Application;
import android.content.Context;

import com.i5d5.basemodule.DI.Qualifier.ApplicationContext;
import com.i5d5.basemodule.WdBaseApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * class_name: ApplicationModule
 * package_name: com.i5d5.basemodule.DI.Module
 * acthor: lucheng
 * time: 2017/3/28 16:45
 */

@Module
public class ApplicationModule {
    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    Application provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    @ApplicationContext
    Context provideApplicationContext() {
        return this.application;
    }


}