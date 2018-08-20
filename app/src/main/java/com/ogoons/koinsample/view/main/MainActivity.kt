package com.ogoons.koinsample.view.main

import com.ogoons.koinsample.R
import com.ogoons.koinsample.view.base.BaseActivity
import org.koin.android.ext.android.get

class MainActivity : BaseActivity() {

    override fun setupPresenter() {
    }

    override fun setupView() {
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, get<MainFragment>() /* Injection */, MainFragment::class.java.simpleName)
                .commit()
    }

}
