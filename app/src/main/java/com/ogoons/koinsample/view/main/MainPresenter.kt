package com.ogoons.koinsample.view.main

import com.ogoons.koinsample.component.LoginManager
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class MainPresenter(private val repository: MainRepository) : MainContract.Presenter, KoinComponent {

    override lateinit var view: MainContract.View

    private val loginManager by inject<LoginManager>()

    override fun signIn() {
        loginManager.signIn()
        repository.signedInCount++
        view.onSignInChange(loginManager.isSignedIn)
    }

    override fun sayHello() {
        view.onSayHello(repository.sayHello())
    }

}