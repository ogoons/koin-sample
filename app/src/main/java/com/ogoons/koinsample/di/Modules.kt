package com.ogoons.koinsample.di

import com.ogoons.koinsample.component.LoginManager
import com.ogoons.koinsample.view.main.MainContract
import com.ogoons.koinsample.view.main.MainFragment
import com.ogoons.koinsample.view.main.MainPresenter
import com.ogoons.koinsample.view.sub.SubContract
import com.ogoons.koinsample.view.sub.SubPresenter
import org.koin.dsl.module.applicationContext

val appModule = applicationContext {
    bean { LoginManager() }
}

val mainModule = applicationContext {
    factory { MainFragment() }
    factory { MainPresenter() as MainContract.Presenter }
}

val subModule = applicationContext {
    factory { SubPresenter() as SubContract.Presenter }
}

val appModules = listOf(appModule, mainModule, subModule)