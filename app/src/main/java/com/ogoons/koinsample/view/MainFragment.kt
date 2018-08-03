package com.ogoons.koinsample.view


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

import com.ogoons.koinsample.R
import com.ogoons.koinsample.view.base.BaseFragment
import org.koin.android.ext.android.inject

/**
 * A simple [Fragment] subclass.
 *
 */
class MainFragment : BaseFragment<MainContract.Presenter, MainContract.View>(), MainContract.View {

    override val presenter by inject<MainContract.Presenter>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btn_login).setOnClickListener {
            presenter.login()
        }
    }

    override fun onLoginChange(isLogged: Boolean) {
        Toast.makeText(requireContext(), isLogged.toString(), Toast.LENGTH_LONG).show()
    }

}
