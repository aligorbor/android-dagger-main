package com.example.android.dagger.user

import javax.inject.Inject
import javax.inject.Singleton
import kotlin.random.Random

/**
 * UserDataRepository contains user-specific data such as username and unread notifications.
 */

@Singleton
class UserDataRepository @Inject constructor() {

    var username: String?=null
       private set

    var unreadNotifications: Int? = null

    init {
        unreadNotifications = randomInt()
    }

    fun refreshUnreadNotifications() {
        unreadNotifications = randomInt()
    }

    fun initData(username: String) {
        this.username = username
        unreadNotifications = randomInt()
    }

    fun cleanUp() {
        username = null
        unreadNotifications = -1
    }

    fun randomInt(): Int {
        return Random.nextInt(until = 100)
    }
}


