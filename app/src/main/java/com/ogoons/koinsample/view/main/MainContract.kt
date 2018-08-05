package com.ogoons.koinsample.view.main

import com.ogoons.koinsample.view.base.BasePresenter
import com.ogoons.koinsample.view.base.BaseView

interface MainContract {

    interface Presenter : BasePresenter<View> {

        fun login()

    }

    interface View : BaseView<Presenter> {

        fun onLoginChange(isLogged: Boolean)

    }

}