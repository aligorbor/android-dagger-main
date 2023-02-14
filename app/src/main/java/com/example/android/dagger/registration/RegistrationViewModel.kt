package com.example.android.dagger.registration

import androidx.lifecycle.ViewModel
import com.example.android.dagger.user.UserManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


/**
 * RegistrationViewModel is the ViewModel that the Registration flow ([RegistrationActivity]
 * and fragments) uses to keep user's input data.
 */
@HiltViewModel
class RegistrationViewModel @Inject constructor(val userManager: UserManager): ViewModel() {

    private var username: String? = null
    private var password: String? = null
    private var acceptedTCs: Boolean? = null

    fun updateUserData(username: String, password: String) {
        this.username = username
        this.password = password
    }

    fun acceptTCs() {
        acceptedTCs = true
    }

    fun registerUser() {
        assert(username != null)
        assert(password != null)
        assert(acceptedTCs == true)

        userManager.registerUser(username!!, password!!)
    }
}
