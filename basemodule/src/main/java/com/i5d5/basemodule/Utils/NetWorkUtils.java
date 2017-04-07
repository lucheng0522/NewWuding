package com.i5d5.basemodule.Utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.i5d5.basemodule.DI.Qualifier.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * 网络连接检测工具
 * class_name: NetWorkUtils
 * package_name: com.i5d5.basemodule.Utils
 * acthor: lucheng
 * time: 2017/3/30 16:12
 */
@Singleton
public class NetWorkUtils {

    private Context context;
    @Inject
    public NetWorkUtils(@ApplicationContext Context context) {
        this.context = context;
    }

    /**
     * 判断网络是否连接
     *
     * @return
     */
    public boolean isConnected() {

        ConnectivityManager connectivity = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        if (null != connectivity) {

            NetworkInfo info = connectivity.getActiveNetworkInfo();
            if (null != info && info.isConnected()) {
                if (info.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 判断是否是wifi连接
     */
    public boolean isWifi() {
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        if (cm == null)
            return false;
        return cm.getActiveNetworkInfo().getType() == ConnectivityManager.TYPE_WIFI;

    }
}
