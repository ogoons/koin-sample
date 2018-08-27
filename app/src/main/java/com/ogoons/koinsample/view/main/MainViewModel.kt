package com.ogoons.koinsample.view.main

import android.arch.lifecycle.ViewModel

class MainViewModel(val repository: MainRepository) : ViewModel() {

    fun sayHello() = "${repository.sayHello()} from $this"

}