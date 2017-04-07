package com.i5d5.basemodule.Presenter;

import io.reactivex.disposables.CompositeDisposable;

/**
 * class_name: BasePresenter
 * package_name: com.i5d5.wuding.WD.Presenter
 * acthor: lucheng
 * time: 2017/3/29 12:38
 */

public class BasePresenter<T extends MvpView> implements Presenter<T> {
    private T mvpView;
    protected CompositeDisposable compositeDisposable;

    /**
     * 关联视图
     *
     * @param mvpView presenter与view交互接口
     */
    @Override
    public void attachView(T mvpView) {
        this.mvpView = mvpView;
        compositeDisposable=new CompositeDisposable();
    }

    /**
     * 取消关联
     */
    @Override
    public void detachView() {
        this.mvpView = null;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
    }

    /**
     * @return 是否已经绑定
     */
    public boolean isViewAttached() {
        return mvpView != null;
    }

    /**
     * @return 回去关联接口
     */
    public T getMvpView() {
        return mvpView;
    }

    /**
     * 如果没有绑定返回错误
     */
    public void checkViewAttached() {
        if (!isViewAttached()) throw new MvpViewNotAttachedException();
    }

    public static class MvpViewNotAttachedException extends RuntimeException {
        public MvpViewNotAttachedException() {
            super("Please call Presenter.attachView(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }
}
