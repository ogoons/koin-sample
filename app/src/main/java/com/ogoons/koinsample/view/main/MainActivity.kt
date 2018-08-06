package com.ogoons.koinsample.view.main

import android.os.Bundle
import com.ogoons.koinsample.R
import com.ogoons.koinsample.view.base.BaseActivity
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject

class MainActivity : BaseActivity() {

//    private val fragment: MainFragment by inject()

    override fun setupPresenter() {
    }

    override fun setupView() {
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, get<MainFragment>(), MainFragment::class.java.simpleName)
                .commit()
    }
}
