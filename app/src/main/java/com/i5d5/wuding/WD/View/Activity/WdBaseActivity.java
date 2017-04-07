package com.i5d5.wuding.WD.View.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.i5d5.basemodule.WdBaseApplication;
import com.i5d5.wuding.MDI.MComponent.DaggerWdActivityComponent;
import com.i5d5.wuding.MDI.MComponent.WdActivityComponent;
import com.i5d5.wuding.MDI.MModule.WdActivityModule;

/**
 * class_name: WdBaseActivity
 * package_name: com.i5d5.wuding
 * acthor: lucheng
 * time: 2017/3/28 13:17
 */

public class WdBaseActivity extends AppCompatActivity {
    private WdActivityComponent wdActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public WdActivityComponent getWdActivityComponent() {
        if (wdActivityComponent == null) {
            wdActivityComponent = DaggerWdActivityComponent.builder()
                    .applicationComponent(WdBaseApplication.get(this).getComponent())
                    .wdActivityModule(new WdActivityModule(this))
                    .build();
        }
        return wdActivityComponent;
    }
}
