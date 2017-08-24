package com.i5d5.wuding.WD.Model.Api;

import com.i5d5.wuding.WD.Model.ClassRootModel;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;

/**
 * class_name: ClassApi
 * package_name: com.i5d5.wuding
 * acthor: lucheng
 * time: 2017/3/28 13:15
 */

public interface ClassApi {

    /**
     * 分类root接口
     * //
     */
    @GET("index.php?act=goods_class")
    Observable<Response<ClassRootModel>> getClassroot();
}
