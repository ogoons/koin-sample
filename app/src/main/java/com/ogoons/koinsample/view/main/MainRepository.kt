package com.ogoons.koinsample.view.main

import android.arch.lifecycle.ViewModel

class MainRepository : ViewModel() {

    var signedInCount = 0

    fun sayHello() = "Hello, Koin"

}