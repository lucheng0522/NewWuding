package com.i5d5.wuding.WD.Presenter;

import android.util.Log;

import com.i5d5.basemodule.Presenter.BasePresenter;
import com.i5d5.basemodule.Presenter.MvpView;
import com.i5d5.basemodule.RX.BaseSubscriber;
import com.i5d5.basemodule.RX.RxSchedulers;
import com.i5d5.wuding.WD.Model.Api.ClassApi;
import com.i5d5.wuding.WD.Model.ClassRootModel;


import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

/**
 * class_name: ClassPresenter
 * package_name: com.i5d5.wuding.WD.Presenter
 * acthor: lucheng
 * time: 2017/3/29 12:51
 */

public class ClassPresenter extends BasePresenter<ClassPresenter.ClassMvpView> {
    private ClassApi classApi;
//    private CompositeDisposable compositeDisposable;
    @Inject
    public ClassPresenter(ClassApi classApi) {
        this.classApi = classApi;
    }

    @Override
    public void attachView(ClassMvpView mvpView) {
        super.attachView(mvpView);
//        compositeDisposable = new CompositeDisposable();
    }

    @Override
    public void detachView() {
        super.detachView();
//        if (compositeDisposable != null)
//            compositeDisposable.dispose();
    }

    //
    public void loadRoot() {
        classApi.getClassroot()
                .compose(RxSchedulers.<Response<ClassRootModel>>compose())
                .subscribe(new BaseSubscriber<Response<ClassRootModel>>(getMvpView()) {
                    @Override
                    public void onWdNext(Response<ClassRootModel> classRootModelResponse) {
                        Log.d("luchengs", classRootModelResponse.code() + "是否成功");
                        classRootModelResponse.body();
                    }

                    @Override
                    public void onWdSubScribe(Disposable d) {
                        compositeDisposable.add(d);
                    }
                });
    }


    public void loadRoots() {
        classApi.getClassroot()
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(@NonNull Disposable disposable) throws Exception {
                        getMvpView().showDialog();
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseSubscriber<Response<ClassRootModel>>(getMvpView()) {
                    @Override
                    public void onWdNext(Response<ClassRootModel> classRootModelResponse) {
                        Log.d("luchengs", classRootModelResponse.code() + "是否成功");
                    }

                    @Override
                    public void onWdSubScribe(Disposable d) {
                        compositeDisposable.add(d);
                    }
                });
    }

    public interface ClassMvpView extends MvpView {

    }
}
