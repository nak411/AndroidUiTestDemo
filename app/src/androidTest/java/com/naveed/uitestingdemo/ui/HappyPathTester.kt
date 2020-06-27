package com.naveed.uitestingdemo.ui

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.naveed.uitestingdemo.MainActivity
import com.naveed.uitestingdemo.robots.happyPath
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HappyPathTester {

    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun runHappyPathTest() {
        happyPath {
            validateHappyPath()
        }
    }
}