package com.i5d5.testmodule.TEST.Model.Api;

import com.i5d5.testmodule.TEST.Model.StoreInfoModel;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * class_name: StoreApi
 * package_name: com.i5d5.testmodule.TEST.Model.Api
 * acthor: lucheng
 * time: 2017/3/31 9:50
 */

public interface StoreApi {
    //店铺信息简介
    @FormUrlEncoded
    @POST("index.php?act=store&op=store_intro")
    Observable<StoreInfoModel> getStoreInfo(@FieldMap HashMap<String, String> order);
}
