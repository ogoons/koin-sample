package com.ogoons.koinsample.view.main

import com.ogoons.koinsample.component.LoginManager
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class MainPresenter(val repository: MainRepository) : MainContract.Presenter, KoinComponent {

    override lateinit var view: MainContract.View

    private val loginManager by inject<LoginManager>()

    override fun login() {
        loginManager.login()
        repository.loggedCount++
        view.onLoginChange(loginManager.isLogged)
    }

    override fun sayHello() {
        view.onSayHello(repository.sayHello())
    }

}