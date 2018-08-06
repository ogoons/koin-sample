package com.ogoons.koinsample.view.base

interface BaseView<P : BasePresenter<*>> {

    val presenter: P

}