package pl.skamycki.circleci

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import org.junit.Ignore
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @Rule
    @JvmField
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun check_hello_world_displayed() {
        onView(withText("Hello World!!"))
                .check(matches(isDisplayed()))
    }
}
