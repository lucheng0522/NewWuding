package com.i5d5.basemodule;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.alibaba.android.arouter.launcher.ARouter;
import com.i5d5.basemodule.DI.Component.ApplicationComponent;
import com.i5d5.basemodule.DI.Module.ApiModule;
import com.i5d5.basemodule.DI.Module.ApplicationModule;
import com.i5d5.basemodule.DI.Component.DaggerApplicationComponent;
import com.squareup.leakcanary.LeakCanary;

/**
 * class_name: WdBaseApplication
 * package_name: com.i5d5.basemodule
 * acthor: lucheng
 * time: 2017/3/28 16:03
 */

public class WdBaseApplication extends MultiDexApplication {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        //内存检查工具
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
        /**
         * 开启页面路由
         */
        ARouter.openDebug();
        ARouter.init(this);

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public static WdBaseApplication get(Context context) {
        return (WdBaseApplication) context.getApplicationContext();
    }

    public ApplicationComponent getComponent() {
        if (applicationComponent == null) {
            this.applicationComponent = DaggerApplicationComponent.builder()
                    .applicationModule(new ApplicationModule(this))
                    .apiModule(new ApiModule())
                    .build();
        }
        return applicationComponent;
    }

    public void setComponent(ApplicationComponent applicationComponent) {
        applicationComponent = applicationComponent;
    }


}
