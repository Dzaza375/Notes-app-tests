package com.example.notesapp.ui;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.notesapp.MainActivity;
import com.example.notesapp.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void mainActivity_launchesSuccessfully() {
        onView(withId(R.id.notesListView)).check(matches(isDisplayed()));
    }

    @Test
    public void mainActivity_menuAddNoteOpensAddActivity() {
        onView(withId(R.id.menu_add_note)).perform(click());
        onView(withId(R.id.txtTitle)).check(matches(isDisplayed()));
    }

    @Test
    public void mainActivity_menuDeleteNoteOpensDeleteActivity() {
        onView(withId(R.id.menu_delete_note)).perform(click());
        onView(withId(R.id.listViewDelete)).check(matches(isDisplayed()));
    }
}
