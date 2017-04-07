package com.i5d5.basemodule.DI.Component;

import android.content.Context;

import com.i5d5.basemodule.DI.Module.ApiModule;
import com.i5d5.basemodule.DI.Module.ApplicationModule;
import com.i5d5.basemodule.DI.Qualifier.ApplicationContext;
import com.i5d5.basemodule.Utils.SPUtils;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * class_name: ApplicationComponent
 * package_name: com.i5d5.basemodule.DI.Component
 * acthor: lucheng
 * 全局component，主要存放一些使用APP生命周期的网络请求和工具类
 * time: 2017/3/28 16:56
 */
@Singleton
@Component(modules = {ApplicationModule.class, ApiModule.class})
public interface ApplicationComponent {
    @ApplicationContext
    Context context();

    SPUtils sputils();

    Retrofit retrofit();
}
