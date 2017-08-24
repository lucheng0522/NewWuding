package com.i5d5.basemodule.ImageLoad;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * class_name: IImageLoaderstrategy
 * package_name: com.i5d5.basemodule.ImageLoad
 * acthor: lucheng
 * time: 2017/7/13 13:27
 */

public interface IImageLoaderstrategy {
    void showImage(@NonNull ImageLoaderOptions options);
    void cleanMemory(Context context);
    // 在application的oncreate中初始化
    void init(Context context);
}
