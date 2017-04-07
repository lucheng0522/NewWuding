package com.i5d5.testmodule.TEST.Presenter;

import android.util.Log;

import com.i5d5.basemodule.Presenter.BasePresenter;
import com.i5d5.basemodule.Presenter.MvpView;
import com.i5d5.basemodule.RX.BaseSubscriber;
import com.i5d5.basemodule.RX.RxSchedulers;
import com.i5d5.testmodule.TEST.Model.Api.StoreApi;
import com.i5d5.testmodule.TEST.Model.StoreInfoModel;

import java.util.HashMap;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * class_name: SecendPresenter
 * package_name: com.i5d5.testmodule.TEST.Presenter
 * acthor: lucheng
 * time: 2017/3/31 10:04
 */

public class SecendPresenter extends BasePresenter<SecendPresenter.SecendMvp> {
    private StoreApi storeApi;
//    private CompositeDisposable compositeDisposable;

    @Inject
    public SecendPresenter(StoreApi storeApi) {
        this.storeApi = storeApi;
    }

    @Override
    public void attachView(SecendMvp mvpView) {
        super.attachView(mvpView);
//        compositeDisposable = new CompositeDisposable();
    }

    @Override
    public void detachView() {
        super.detachView();
//        if (compositeDisposable != null) {
//            compositeDisposable.dispose();
//        }
    }

    public void getStore(HashMap<String, String> storeMap) {
        storeApi.getStoreInfo(storeMap).compose(RxSchedulers.<StoreInfoModel>compose())
                .subscribe(new BaseSubscriber<StoreInfoModel>(getMvpView()) {
                    @Override
                    public void onWdNext(StoreInfoModel storeInfoModel) {
                        Log.d("luchengs",storeInfoModel.getCode()+"storeh获取成功");
                    }

                    @Override
                    public void onWdSubScribe(Disposable d) {
                        compositeDisposable.add(d);
                    }
                });

    }

    public interface SecendMvp extends MvpView {

    }
}
