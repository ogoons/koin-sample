package com.ogoons.koinsample.view.main

import com.ogoons.koinsample.view.base.BasePresenter
import com.ogoons.koinsample.view.base.BaseView

interface MainContract {

    interface Presenter : BasePresenter<View> {

        fun login()

        fun sayHello()

    }

    interface View : BaseView<Presenter> {

        fun onLoginChange(isLogged: Boolean)

        fun onSayHello(result: String)

    }

}