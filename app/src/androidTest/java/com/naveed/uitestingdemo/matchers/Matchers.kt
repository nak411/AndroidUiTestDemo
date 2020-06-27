package com.naveed.uitestingdemo.matchers

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.naveed.uitestingdemo.R
import org.hamcrest.Matcher

object MyMatchers {

    val btnLaunch: Matcher<View>
        get() = withId(R.id.btn_hello)
}