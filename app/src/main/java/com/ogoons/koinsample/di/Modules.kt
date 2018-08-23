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
    single { (repository: MainRepository) -> MainPresenter(repository) as MainContract.Presenter }
    single { MainRepository() }

    viewModel { MainViewModel(get()) }
}

/**
 * Sub
 */
val subModule = module {
    factory { SubPresenter() as SubContract.Presenter }
}

val appModules = listOf(appModule, mainModule, subModule)