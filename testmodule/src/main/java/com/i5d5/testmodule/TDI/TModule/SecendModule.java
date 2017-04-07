package com.i5d5.testmodule.TDI.TModule;

import com.i5d5.testmodule.TDI.Scop.TestScop;
import com.i5d5.testmodule.TEST.Model.Api.StoreApi;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * class_name: SecendModule
 * package_name: com.i5d5.testmodule.TDI.TModule
 * acthor: lucheng
 * time: 2017/3/31 9:38
 */
@Module
public class SecendModule {
    @Provides
    @TestScop
    StoreApi provideStoreService(Retrofit retrofit) {
        return retrofit.create(StoreApi.class);
    }
}
