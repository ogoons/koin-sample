package com.ogoons.koinsample.view.main

import com.ogoons.koinsample.view.base.BasePresenter
import com.ogoons.koinsample.view.base.BaseView

interface MainContract {

    interface Presenter : BasePresenter<View> {

        fun signIn()

        fun sayHello()

    }

    interface View : BaseView<Presenter> {

        fun onSignIn()

        fun onSignInChange(isSignedIn: Boolean)

        fun onSayHello(result: String)

    }

}