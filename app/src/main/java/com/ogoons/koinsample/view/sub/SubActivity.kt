package com.ogoons.koinsample.view.sub

import android.os.Bundle
import android.widget.Toast
import com.ogoons.koinsample.R
import com.ogoons.koinsample.view.base.BaseActivity
import kotlinx.android.synthetic.main.activity_sub.*
import org.koin.android.ext.android.inject

class SubActivity : BaseActivity<SubContract.Presenter, SubContract.View>(), SubContract.View {

    override val presenter by inject<SubContract.Presenter>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        presenter.view = this

        btn_check_logged.setOnClickListener {
            presenter.isLogged()
        }

        btn_logout.setOnClickListener {
            presenter.logout()
        }
    }

    override fun onLoginChange(isLogged: Boolean) {
        Toast.makeText(this, isLogged.toString(), Toast.LENGTH_LONG).show()
    }

}
