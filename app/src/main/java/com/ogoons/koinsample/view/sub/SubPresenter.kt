package com.ogoons.koinsample.view.sub

import com.ogoons.koinsample.component.LoginManager
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class SubPresenter(override val view: SubContract.View) : SubContract.Presenter, KoinComponent {

    private val loginManager by inject<LoginManager>()

    override fun isLogged() {
        view.onLoginChange(loginManager.isLogged)
    }

    override fun logout() {
        loginManager.logout()
        view.onLoginChange(loginManager.isLogged)
    }

}