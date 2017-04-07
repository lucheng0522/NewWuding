package com.i5d5.testmodule.TEST.View.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.i5d5.basemodule.WdBaseApplication;
import com.i5d5.testmodule.TDI.TComponent.TestActivityComponent;
import com.i5d5.testmodule.TDI.TModule.TestActivityModule;
import com.i5d5.testmodule.TDI.TComponent.DaggerTestActivityComponent;

/**
 * class_name: TestBaseActivity
 * package_name: com.i5d5.testmodule.TEST.View.Activity
 * acthor: lucheng
 * time: 2017/3/31 9:42
 */

public class TestBaseActivity extends AppCompatActivity {
    private TestActivityComponent testActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public TestActivityComponent getTestActivityComponent() {
        if (testActivityComponent == null) {
            testActivityComponent = DaggerTestActivityComponent.builder()
                    .applicationComponent(WdBaseApplication.get(this).getComponent())
                    .testActivityModule(new TestActivityModule(this))
                    .build();
        }
        return testActivityComponent;
    }
}
