package com.example.basicactivitytests

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondActivityTest{

    @get:Rule
    val activityRule = ActivityScenarioRule(SecondActivity::class.java)

    @Test
    fun isActivityDisplayed(){

        onView(withId(R.id.second_activity)).check(matches(isDisplayed()))
        onView(withId(R.id.back_button)).perform(click())
        onView(withId(R.id.main_activity)).check(matches(isDisplayed()))
    }
}