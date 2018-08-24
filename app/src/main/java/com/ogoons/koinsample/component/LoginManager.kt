package com.ogoons.koinsample.component

class LoginManager {

    var isSignedIn = false

    fun login() {
        isSignedIn = true
    }

    fun logout() {
        isSignedIn = false
    }

}