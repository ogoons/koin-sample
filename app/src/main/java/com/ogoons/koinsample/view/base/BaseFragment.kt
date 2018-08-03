package com.ogoons.koinsample.view.base


import android.support.v4.app.Fragment
import com.ogoons.dagger2sample.view.base.BasePresenter
import com.ogoons.dagger2sample.view.base.BaseView


abstract class BaseFragment<P : BasePresenter<V>, V : BaseView<P>> : Fragment() {

//    lateinit var presenter: P
//        internal set

}
