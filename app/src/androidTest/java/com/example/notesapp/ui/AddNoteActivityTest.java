package com.example.notesapp.ui;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.notesapp.AddNoteActivity;
import com.example.notesapp.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class AddNoteActivityTest {

    @Rule
    public ActivityScenarioRule<AddNoteActivity> activityRule =
            new ActivityScenarioRule<>(AddNoteActivity.class);

    @Test
    public void addNote_noteIsAdded() {
        onView(withId(R.id.txtTitle))
                .perform(typeText("Тестовая заметка"), closeSoftKeyboard());

        onView(withId(R.id.txtContent))
                .perform(typeText("Содержание заметки"), closeSoftKeyboard());

        onView(withId(R.id.btnSave)).perform(click());

        onView(withId(R.id.txtTitle)).check(doesNotExist());
    }
}
