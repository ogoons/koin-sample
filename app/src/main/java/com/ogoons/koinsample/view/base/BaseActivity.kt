package com.ogoons.koinsample.view.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ogoons.dagger2sample.view.base.BasePresenter
import com.ogoons.dagger2sample.view.base.BaseView

abstract class BaseActivity<P : BasePresenter<V>, V : BaseView<P>> : AppCompatActivity() {

    lateinit var presenter: P
        internal set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

}