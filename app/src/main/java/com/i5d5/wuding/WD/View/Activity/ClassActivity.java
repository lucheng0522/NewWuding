package com.i5d5.wuding.WD.View.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Button;

//import com.i5d5.testmodule.TEST.View.Activity.SecendActivity;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.i5d5.basemodule.Utils.SPUtils;
import com.i5d5.testmodule.TEST.View.Activity.SecendActivity;
import com.i5d5.wuding.MDI.MComponent.WdClassComponent;
import com.i5d5.wuding.MDI.MModule.ClassModule;
import com.i5d5.wuding.R;
import com.i5d5.wuding.WD.Presenter.ClassPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Retrofit;
import retrofit2.http.Path;

/**
 * class_name: ClassActivity
 * package_name: com.i5d5.wuding.WD.View.Activity
 * acthor: lucheng
 * time: 2017/3/29 10:55
 */
@Route(path = "/main/class")
public class ClassActivity extends WdBaseActivity implements ClassPresenter.ClassMvpView {
    @BindView(R.id.button)
    Button button;

    @Inject
    ClassPresenter classPresenter;
    @Inject
    ClassModule classModule;
    @Inject
    SPUtils spUtils;
    @Inject
    Retrofit retrofit;
    private WdClassComponent wdClassComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);
        ButterKnife.bind(this);
        initComponent();
        classPresenter.attachView(this);
        classPresenter.loadRoot();
        Log.d("luchengs", retrofit.toString() + "+++++class");
        Log.d("luchengs", spUtils.toString() + "+++++class");
    }

    public static void startClassActivity(Activity activity) {
        ARouter.getInstance().build("/main/class").navigation(activity);

    }

    private void initComponent() {
        wdClassComponent = getWdActivityComponent().wdClassComponent();
        wdClassComponent.inject(this);
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

    @OnClick(R.id.button)
    public void onViewClicked() {
        Intent intent = new Intent(ClassActivity.this, SecendActivity.class);
        startActivity(intent);

    }
}
