package com.ogoons.koinsample.view.baseext

import java.lang.ref.WeakReference

abstract class BasePresenter<V> : MvpPresenter<V> {

    private var viewRef: WeakReference<V>? = null

    fun getView(): V? {
       return viewRef?.get()
    }

    fun isViewAttached(): Boolean {
        return viewRef?.let { it.get()?.run { true } ?: false } ?: false
    }

    override fun attachView(view: V) {
        viewRef = WeakReference(view)
    }

    override fun detachView(retainInstance: Boolean) {
        if (!retainInstance) {
            viewRef?.let {
                it.clear()
                viewRef = null
            }
        }
    }

}