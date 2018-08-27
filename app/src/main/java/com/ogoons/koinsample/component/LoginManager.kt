package com.ogoons.koinsample.component

class LoginManager {

    var isSignedIn = false

    fun signIn() {
        isSignedIn = true
    }

    fun signOut() {
        isSignedIn = false
    }

}