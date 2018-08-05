package com.ogoons.koinsample.view.main

import android.os.Bundle
import com.ogoons.koinsample.R
import com.ogoons.koinsample.view.base.BaseActivity
import org.koin.android.ext.android.inject

class MainActivity : BaseActivity<MainContract.Presenter, MainContract.View>() {

    private val fragment by inject<MainFragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment, MainFragment::class.java.simpleName)
                .commit()

    }

}
