package com.ogoons.koinsample.view.sub

import com.ogoons.koinsample.component.LoginManager
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class SubPresenter : SubContract.Presenter, KoinComponent {

    override lateinit var view: SubContract.View

    private val loginManager by inject<LoginManager>()

    override fun isSignedIn() {
        view.onSignInChange(loginManager.isSignedIn)
    }

    override fun signIn() {
        loginManager.signOut()
        view.onSignOut()
        view.onSignInChange(loginManager.isSignedIn)
    }

}