package com.ogoons.koinsample.di

import com.ogoons.koinsample.component.LoginManager
import com.ogoons.koinsample.view.main.*
import com.ogoons.koinsample.view.sub.SubContract
import com.ogoons.koinsample.view.sub.SubPresenter
import org.koin.android.viewmodel.ext.koin.viewModel
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
    factory { (view: MainContract.View, repository: MainRepository) -> MainPresenter(view, repository) as MainContract.Presenter }
    factory { MainRepository() }

    viewModel { MainViewModel(get()) }
}

/**
 * Sub
 */
val subModule = module {
    factory { (view: SubContract.View) -> SubPresenter(view) as SubContract.Presenter }
}

val appModules = listOf(appModule, mainModule, subModule)