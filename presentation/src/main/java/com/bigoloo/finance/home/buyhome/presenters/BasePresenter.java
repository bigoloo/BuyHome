package com.bigoloo.finance.home.buyhome.presenters;

import java.lang.ref.WeakReference;

import javax.annotation.Nullable;

/**
 * Created by Amin Bahiraei (mr.bahiraee@gmail.com) at  1/21/18.
 */


public class BasePresenter<V> {

    private WeakReference<V> view;


    public void onViewAttached(V view) {
        this.view = new WeakReference<>(view);
    }


    public void onViewDetached() {
        if (view != null) view.clear();
    }


    public void onDestroyed() {
        view = null;
    }

    @Nullable

    public V getView() {
        return view == null ? null : view.get();
    }


    public boolean isViewAttached() {
        return view != null && view.get() != null;
    }
}

