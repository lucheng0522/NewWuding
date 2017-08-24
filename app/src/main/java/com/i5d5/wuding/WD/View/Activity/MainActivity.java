package com.i5d5.wuding.WD.View.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.i5d5.basemodule.Utils.RxBus;
import com.i5d5.basemodule.Utils.SPUtils;
import com.i5d5.wuding.MDI.MComponent.WdStoreComponent;
import com.i5d5.wuding.MDI.MModule.ClassModule;
import com.i5d5.wuding.R;
import com.i5d5.wuding.WD.Model.RXsign;

import org.w3c.dom.Text;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
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
    private CompositeDisposable disposable;
    private int code = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
        registRxBus();
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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (!disposable.isDisposed())
        disposable.dispose();
    }

    private void initComponent() {
        wdStoreComponent = getWdActivityComponent().wdStoreComponent();
        wdStoreComponent.inject(this);
    }


    private void registRxBus() {
        disposable = new CompositeDisposable();
        RxBus.getDefault().toObserverable(RXsign.class)
                .subscribe(new Observer<RXsign>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        disposable.add(d);
                    }

                    @Override
                    public void onNext(RXsign rXsign) {
                        code++;
                        textView.setText(String.valueOf(code));

                    }
                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }

                });
    }
}
