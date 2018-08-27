package com.ogoons.koinsample.view.sub

import com.ogoons.koinsample.view.base.BasePresenter
import com.ogoons.koinsample.view.base.BaseView

interface SubContract {

    interface Presenter : BasePresenter<View> {

        fun signIn()

        fun isSignedIn()

    }

    interface View : BaseView<Presenter> {

        fun onSignInChange(isSignedIn: Boolean)

        fun onSignIn()

        fun onSignOut()
        
    }

}