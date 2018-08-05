package com.ogoons.koinsample.view.sub

import com.ogoons.koinsample.view.base.BasePresenter
import com.ogoons.koinsample.view.base.BaseView

interface SubContract {

    interface Presenter : BasePresenter<View> {

        fun logout()

        fun isLogged()

    }

    interface View : BaseView<Presenter> {

        fun onLoginChange(isLogged: Boolean)
        
    }

}