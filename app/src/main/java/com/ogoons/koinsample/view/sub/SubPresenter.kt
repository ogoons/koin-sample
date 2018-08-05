package com.ogoons.koinsample.view.sub

import com.ogoons.koinsample.component.LoginManager
import com.ogoons.koinsample.view.base.BasePresenter
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class SubPresenter : BasePresenter<SubContract.View>, SubContract.Presenter, KoinComponent {

    override lateinit var view: SubContract.View

    private val loginManager by inject<LoginManager>()

    override fun isLogged() {
        view.onLoginChange(loginManager.isLogged)
    }

    override fun logout() {
        loginManager.logout()
        view.onLoginChange(loginManager.isLogged)
    }

}