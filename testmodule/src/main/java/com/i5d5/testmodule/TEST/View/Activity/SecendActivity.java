package com.i5d5.testmodule.TEST.View.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;

import com.i5d5.basemodule.Utils.SPUtils;
import com.i5d5.testmodule.R;
import com.i5d5.testmodule.TDI.TComponent.SecendComponent;
import com.i5d5.testmodule.TEST.Presenter.SecendPresenter;


import java.util.HashMap;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * class_name: SecendActivity
 * package_name: com.i5d5.testmodule.TEST.View.Activity
 * acthor: lucheng
 * time: 2017/3/31 9:39
 */

public class SecendActivity extends TestBaseActivity implements SecendPresenter.SecendMvp {
    @Inject
    SecendPresenter secendPresenter;
    @Inject
    SPUtils spUtils;
    @Inject
    Retrofit retrofit;
    TextView textView;
    private SecendComponent secendComponent;
    private HashMap<String, String> storeMap;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secend);
        initComponent();
        secendPresenter.attachView(this);
        storeMap = new HashMap<>();
        storeMap.put("store_id", "23");
        secendPresenter.getStore(storeMap);
//        Log.d("luchengs", retrofit.toString() + "+++++secend ");
        Log.d("luchengs", spUtils.toString() + "+++++secend ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        secendPresenter.detachView();
    }

    private void initComponent() {
        secendComponent = getTestActivityComponent().secendComponent();
        secendComponent.inject(this);
    }

    @Override
    public void showDialog() {

    }

    @Override
    public void hideDialog() {

    }

    @Override
    public void showError() {

    }

//    @OnClick({R2.id.button, R2.id.textView})
//    public void onViewClicked(View view) {
//        int id = view.getId();
//        if (id == R.id.button) {
//            Toast.makeText(this, "button点击", Toast.LENGTH_LONG).show();
//        } else if (id == R.id.textView) {
//            Toast.makeText(this, "text点击", Toast.LENGTH_LONG).show();
//        }
//
//    }
}
