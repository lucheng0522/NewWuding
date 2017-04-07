package com.i5d5.basemodule.RX;

import com.i5d5.basemodule.Presenter.MvpView;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DefaultObserver;
import io.reactivex.subscribers.DefaultSubscriber;

/**
 * class_name: BaseSubscriber
 * package_name: com.i5d5.basemodule.RX
 * acthor: lucheng
 * time: 2017/3/30 14:30
 */

public abstract class BaseSubscriber<T> implements Observer<T> {

    private MvpView mvpView;

    public BaseSubscriber(MvpView mvpView) {
        this.mvpView = mvpView;
    }


    @Override
    public void onSubscribe(Disposable d) {
        onWdSubScribe(d);
    }

    @Override
    public void onNext(T t) {
        onWdNext(t);
    }

    @Override
    public void onError(Throwable e) {
        if (mvpView != null) {
            mvpView.hideDialog();
        }
    }

    @Override
    public void onComplete() {
        if (mvpView != null) {
            mvpView.hideDialog();
        }
    }

    public abstract void onWdNext(T t);

    public abstract void onWdSubScribe(Disposable d);
}
