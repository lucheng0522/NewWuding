package com.i5d5.basemodule.RX;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * class_name: RxbusObserver
 * package_name: com.dao.tianyi.RX
 * acthor: lucheng
 * time: 2017/6/20 9:16
 */

public abstract class RxbusObserver<T> implements Observer<T> {
    @Override
    public void onComplete() {

    }

    @Override
    public void onSubscribe(Disposable d) {
        onRxSubscribe(d);
    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onNext(T t) {
        onRxNext(t);
    }

    public abstract void onRxNext(T t);

    public abstract void onRxSubscribe(Disposable d);
}
