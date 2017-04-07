package com.i5d5.wuding.WD.View.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.i5d5.basemodule.Utils.SPUtils;
import com.i5d5.wuding.MDI.MComponent.WdStoreComponent;
import com.i5d5.wuding.MDI.MModule.ClassModule;
import com.i5d5.wuding.R;

import org.w3c.dom.Text;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class MainActivity extends WdBaseActivity {


    @Inject
    ClassModule classModule;

    @Inject
    Retrofit retrofit;      //为了测试是否单例。实际无用
    @Inject
    SPUtils spUtils;
    private TextView textView;
    private WdStoreComponent wdStoreComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
//        Log.d("luchengs", classModule.toString() + "+++++xuxu ");
//        Log.d("luchengs", retrofit.toString() + "+++++main ");
        Log.d("luchengs", spUtils.toString() + "+++++main ");

        textView = (TextView) findViewById(R.id.text);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClassActivity.startClassActivity(MainActivity.this);
            }
        });
    }

    private void initComponent() {
        wdStoreComponent = getWdActivityComponent().wdStoreComponent();
        wdStoreComponent.inject(this);
    }
}
