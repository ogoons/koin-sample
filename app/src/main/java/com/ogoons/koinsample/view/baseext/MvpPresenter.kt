package com.ogoons.koinsample.view.baseext

interface MvpPresenter<V> {

    fun attachView(view: V)

    fun detachView(retainInstance: Boolean = false)

}