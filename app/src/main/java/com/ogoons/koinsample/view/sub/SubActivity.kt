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

        btn_check_signed_in.setOnClickListener { presenter.isSignedIn() }

        btn_logout.setOnClickListener { presenter.signIn() }
    }

    override fun onSignInChange(isSignedIn: Boolean) {
        Toast.makeText(this, if (isSignedIn) "Signed in" else "Not signed in", Toast.LENGTH_LONG).show()
    }

    override fun onSignIn() {
    }

    override fun onSignOut() {
        finish()
    }

}
