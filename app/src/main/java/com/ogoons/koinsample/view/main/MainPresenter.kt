package com.ogoons.koinsample.view.main

import com.ogoons.koinsample.component.LoginManager
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class MainPresenter : MainContract.Presenter, KoinComponent {

    override lateinit var view: MainContract.View

    private val loginManager by inject<LoginManager>()

    override fun login() {
        loginManager.login()

        view.onLoginChange(loginManager.isLogged)

//        view.onLoginChange(loginManager.isLogged)
    }

}