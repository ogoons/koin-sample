package com.ogoons.koinsample.view.base

import android.support.v7.app.AppCompatActivity

abstract class BaseActivity<P : BasePresenter<V>, V : BaseView<P>> : AppCompatActivity()