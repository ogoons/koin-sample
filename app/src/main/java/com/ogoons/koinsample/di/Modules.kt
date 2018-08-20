package com.ogoons.koinsample.di

import com.ogoons.koinsample.component.LoginManager
import com.ogoons.koinsample.view.main.MainActivity
import com.ogoons.koinsample.view.main.MainContract
import com.ogoons.koinsample.view.main.MainFragment
import com.ogoons.koinsample.view.main.MainPresenter
import com.ogoons.koinsample.view.sub.SubContract
import com.ogoons.koinsample.view.sub.SubPresenter
import org.koin.dsl.module.module

/**
 * Application
 */
val appModule = module {
    single { LoginManager() }
}

/**
 * Main
 */
val mainModule = module {
    factory { MainFragment() }
    factory { (view: MainContract.View) -> MainPresenter(view) as MainContract.Presenter }
}

/**
 * Sub
 */
val subModule = module {
    factory { (view: SubContract.View) -> SubPresenter(view) as SubContract.Presenter }
}

val appModules = listOf(appModule, mainModule, subModule)