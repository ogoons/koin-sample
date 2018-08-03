package com.ogoons.koinsample.component

class LoginManager {

    var isLogged = false

    fun login() {
        isLogged = true
    }

    fun logout() {
        isLogged = false
    }

}