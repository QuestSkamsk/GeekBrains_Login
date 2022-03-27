package com.example.geekbrains_login
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isEnabled
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.hamcrest.Matchers.not

class LoginPage {
    fun setUserName(name: String): LoginPage {
        Espresso.onView(withId(R.id.username)).perform(typeText(name))
        return this
    }

    fun checkLoginButtonIsDisable(): LoginPage {
        Espresso.onView(withId(R.id.login))
            .check(matches(not(isEnabled())))
    return this
    }

    fun setPassword(password: String): LoginPage {
       Espresso.onView(withId(R.id.password)).perform(typeText(password))
        return this
    }
}