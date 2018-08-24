package com.ogoons.koinsample.view.main

import android.widget.Toast
import com.ogoons.koinsample.R
import com.ogoons.koinsample.component.LoginManager
import com.ogoons.koinsample.view.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf



class MainActivity : BaseActivity(), MainContract.View {

    override val presenter by inject<MainContract.Presenter> { parametersOf( viewModel.repository) }

    private val viewModel: MainViewModel by viewModel()

    override fun setupPresenter() {
        presenter.view = this
    }

    override fun setupView() {
        setContentView(R.layout.activity_main)

        button.setOnClickListener { presenter.login() }

        updateLoginCount()

        updateSignedIn()

        supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, get<MainFragment>(), MainFragment::class.java.simpleName)
                .commit()
    }

    private fun updateLoginCount() {
        tv_login_count.text = String.format("%d Count", viewModel.repository.signed_inCount)
    }

    private fun updateSignedIn() {
        val loginManager = get<LoginManager>()
        tv_signed_in.text = if (loginManager.isSignedIn) "Signed in" else "Not signed in"
    }

    override fun onLoginChange(isSignedIn: Boolean) {
        if (isSignedIn) {
            updateLoginCount()
        }
        updateSignedIn()
    }

    override fun onSayHello(result: String) {
        Toast.makeText(this, result, Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        updateSignedIn()
    }

}
