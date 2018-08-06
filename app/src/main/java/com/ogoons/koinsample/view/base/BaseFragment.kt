package com.ogoons.koinsample.view.base


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View

abstract class BaseFragment : Fragment() {

    protected abstract fun setupPresenter()

    protected abstract fun setupView()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupPresenter()

        setupView()
    }

}