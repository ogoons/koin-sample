package com.ogoons.koinsample.di

import com.ogoons.koinsample.component.LoginManager
import com.ogoons.koinsample.view.MainContract
import com.ogoons.koinsample.view.MainFragment
import com.ogoons.koinsample.view.MainPresenter
import org.koin.dsl.module.applicationContext

val appModule = applicationContext {

    bean { LoginManager() }

}


val mainModule = applicationContext {

    bean { MainFragment() }

    factory { MainPresenter(get<MainFragment>()) as MainContract.Presenter }

}

val appModules = listOf(appModule, mainModule)