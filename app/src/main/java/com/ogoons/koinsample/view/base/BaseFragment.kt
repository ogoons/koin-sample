package com.ogoons.koinsample.view.base


import android.support.v4.app.Fragment

abstract class BaseFragment<P : BasePresenter<V>, V : BaseView<P>> : Fragment()