package com.i5d5.basemodule.DI.Module;

import android.util.Log;

import com.i5d5.basemodule.Constant;
import com.i5d5.basemodule.FastJson.FastJsonConverterFactory;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * class_name: ApiModule
 * package_name: com.i5d5.basemodule.DI.Module
 * acthor: lucheng
 * time: 2017/3/29 10:23
 */
@Module
public class ApiModule {
    public ApiModule() {
    }


    @Provides
    @Singleton
    OkHttpClient provideClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.d("lucheng", message);
            }
        });
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        Cache cache = new Cache(new File(App.getCacheDir(), "HttpCache"), 1024 * 1024 * 100);
        return new OkHttpClient.Builder()
//                .cache(cache)
                .addInterceptor(interceptor)
                .retryOnConnectionFailure(true)
                .connectTimeout(15, TimeUnit.SECONDS)
//                .sslSocketFactory(sslSocketFactory)
                .build();
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder()
                .baseUrl(Constant.BASE_URL)
                .addConverterFactory(FastJsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build();
    }

}
