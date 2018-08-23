package com.ogoons.koinsample.view.sub

import android.widget.Toast
import com.ogoons.koinsample.R
import com.ogoons.koinsample.view.base.BaseActivity
import kotlinx.android.synthetic.main.activity_sub.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class SubActivity : BaseActivity(), SubContract.View {

    override val presenter by inject<SubContract.Presenter> { parametersOf(this) }

    override fun setupPresenter() {
        presenter.view = this
    }

    override fun setupView() {
        setContentView(R.layout.activity_sub)

        btn_check_logged.setOnClickListener {
            presenter.isLogged()
        }

        btn_logout.setOnClickListener {
            presenter.logout()
        }
    }

    override fun onLoginChange(isLogged: Boolean) {
        Toast.makeText(this, if (isLogged) "Logged" else "Not logged", Toast.LENGTH_LONG).show()
    }

}
