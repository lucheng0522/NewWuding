package com.i5d5.basemodule.Utils;

import android.view.View;

import java.util.Calendar;

/**
 * 防止短时间内二次点击
 * class_name: NoDoubleClickListener
 * package_name: com.i5d5.salamu.Utils
 * acthor: lucheng
 * time: 2016/8/29 10:27
 */
public abstract class NoDoubleClickListener implements View.OnClickListener {
    public static final int MIN_CLICK_DELAY_TIME = 1000;
    private long lastClickTime = 0;

    @Override
    public void onClick(View v) {
        long currentTime = Calendar.getInstance().getTimeInMillis();
        if (currentTime - lastClickTime > MIN_CLICK_DELAY_TIME) {
            lastClickTime = currentTime;
            onNoDoubleClick(v);
        }
    }

    public abstract void onNoDoubleClick(View v);
}
