package com.ogoons.koinsample.view.baseext

/**
 * 사용 안 함
 */
interface MvpPresenter<V> {

    fun attachView(view: V)

    fun detachView(retainInstance: Boolean = false)

}