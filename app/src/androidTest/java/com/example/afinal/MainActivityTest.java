package com.example.afinal;

import org.junit.Rule;
import org.junit.Test;
import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


public class MainActivityTest {

    private String pwd1="passworD";
    private String pwd2="passworDd";
    private String pwd3="passworD8";
    private String pwd4="password8!";
    private String pwd5="passworD8!";
    private String pwd6="passwor";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void testActivity(){
        Espresso.onView(withId(R.id.pwdtxt)).perform(typeText(pwd1), closeSoftKeyboard());
        Espresso.onView(withId(R.id.btn)).perform(click());
        Espresso.onView(withId(R.id.fdbk)).check(matches(withText("Don't use \"password\" as your password!(caseinsensitive)")));

        Espresso.onView(withId(R.id.pwdtxt)).perform(typeText(pwd2), closeSoftKeyboard());
        Espresso.onView(withId(R.id.btn)).perform(click());
        Espresso.onView(withId(R.id.fdbk)).check(matches(withText("At lease 1 number needed!")));

        Espresso.onView(withId(R.id.pwdtxt)).perform(typeText(pwd3), closeSoftKeyboard());
        Espresso.onView(withId(R.id.btn)).perform(click());
        Espresso.onView(withId(R.id.fdbk)).check(matches(withText("At lease 1 special character needed!")));

        Espresso.onView(withId(R.id.pwdtxt)).perform(typeText(pwd4), closeSoftKeyboard());
        Espresso.onView(withId(R.id.btn)).perform(click());
        Espresso.onView(withId(R.id.fdbk)).check(matches(withText("Both upper & lower case character needed!")));

        Espresso.onView(withId(R.id.pwdtxt)).perform(typeText(pwd5), closeSoftKeyboard());
        Espresso.onView(withId(R.id.btn)).perform(click());
        Espresso.onView(withId(R.id.fdbk)).check(matches(withText("Password is strong!")));

        Espresso.onView(withId(R.id.pwdtxt)).perform(typeText(pwd6), closeSoftKeyboard());
        Espresso.onView(withId(R.id.btn)).perform(click());
        Espresso.onView(withId(R.id.fdbk)).check(matches(withText("At least 8 characters long!")));
    }
}