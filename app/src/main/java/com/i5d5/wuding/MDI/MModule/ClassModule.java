package com.i5d5.wuding.MDI.MModule;

import com.i5d5.wuding.MDI.Scop.WdMainScop;
import com.i5d5.wuding.WD.Model.Api.ClassApi;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * class_name: ClassModule
 * package_name: com.i5d5.wuding.MDI.MModule
 * acthor: lucheng
 * time: 2017/3/29 10:58
 */
@Module
public class ClassModule {
    /**
     * 商品分类接口
     *
     * @return
     */
    @Provides
    @WdMainScop
    ClassApi provideClasstService(Retrofit retrofit) {
        return retrofit.create(ClassApi.class);
    }
}
