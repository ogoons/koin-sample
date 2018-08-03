package com.ogoons.koinsample.view

import com.ogoons.dagger2sample.view.base.BasePresenter
import com.ogoons.dagger2sample.view.base.BaseView

interface MainContract {

    interface Presenter : BasePresenter<View> {

        fun login()

    }

    interface View : BaseView<Presenter> {

        fun onLoginChange(isLogged: Boolean)
        
    }

}