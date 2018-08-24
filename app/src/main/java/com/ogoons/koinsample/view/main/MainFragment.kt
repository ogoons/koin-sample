package com.ogoons.koinsample.view.main


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.ogoons.koinsample.R
import com.ogoons.koinsample.view.base.BaseFragment
import com.ogoons.koinsample.view.sub.SubActivity
import kotlinx.android.synthetic.main.fragment_main.*
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

/**
 * A simple [Fragment] subclass.
 *
 */
class MainFragment : BaseFragment(), MainContract.View {

    // lazy
    override val presenter by inject<MainContract.Presenter>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onLoginChange(isSignedIn: Boolean) {
        Toast.makeText(requireContext(), isSignedIn.toString(), Toast.LENGTH_LONG).show()
    }

    override fun setupPresenter() {
    }

    override fun setupView() {
        btn_login.setOnClickListener { presenter.login() }

        btn_sub_activity.setOnClickListener {
            startActivity(Intent(requireActivity(), SubActivity::class.java))
        }
    }

    override fun onSayHello(result: String) {
    }

}
