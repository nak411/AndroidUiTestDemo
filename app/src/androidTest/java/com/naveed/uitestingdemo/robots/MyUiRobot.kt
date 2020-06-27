package com.naveed.uitestingdemo.robots

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.naveed.uitestingdemo.matchers.MyMatchers



fun happyPath(
    func : MyUiRobot.() -> Unit
) = MyUiRobot().apply(func)

class MyUiRobot {

    fun validateHappyPath() {
        onView(MyMatchers.btnLaunch).check(matches(isDisplayed()))
    }
}