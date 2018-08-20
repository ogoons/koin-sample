package com.ogoons.koinsample.view.main

import android.widget.Toast
import com.ogoons.koinsample.R
import com.ogoons.koinsample.view.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class MainActivity : BaseActivity(), MainContract.View {

    override val presenter by inject<MainContract.Presenter> { parametersOf(this, viewModel.repository) }

    private val viewModel: MainViewModel by viewModel()

    override fun setupPresenter() {
    }

    override fun setupView() {
        setContentView(R.layout.activity_main)

        button.setOnClickListener { presenter.sayHello() }

        supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, get<MainFragment>(), MainFragment::class.java.simpleName)
                .commit()
    }

    override fun onLoginChange(isLogged: Boolean) {
    }

    override fun onSayHello(result: String) {
        Toast.makeText(this, result, Toast.LENGTH_LONG).show()
    }

}
