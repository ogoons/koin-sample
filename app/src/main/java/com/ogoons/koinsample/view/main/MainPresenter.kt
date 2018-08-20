package com.ogoons.koinsample.view.main

import com.ogoons.koinsample.component.LoginManager
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class MainPresenter(override val view: MainContract.View, val repository: MainRepository) : MainContract.Presenter, KoinComponent {

    private val loginManager by inject<LoginManager>()

    override fun login() {
        loginManager.login()
        view.onLoginChange(loginManager.isLogged)
    }

    override fun sayHello() {
        view.onSayHello(repository.sayHello())
    }

}