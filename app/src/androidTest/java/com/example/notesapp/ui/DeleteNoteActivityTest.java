package com.example.notesapp.ui;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.notesapp.DeleteNoteActivity;
import com.example.notesapp.R;
import com.example.notesapp.data.SharedPrefStorage;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.anything;

@RunWith(AndroidJUnit4.class)
public class DeleteNoteActivityTest {

    @Rule
    public ActivityScenarioRule<DeleteNoteActivity> activityRule =
            new ActivityScenarioRule<>(DeleteNoteActivity.class);

    @Before
    public void setUp() {
        SharedPrefStorage storage = new SharedPrefStorage(
                androidx.test.core.app.ApplicationProvider.getApplicationContext());
        storage.saveNote(new com.example.notesapp.data.Note("Тест", "Текст"));
    }

    @Test
    public void deleteNote_noteIsRemoved() {
        onData(anything()).inAdapterView(withId(R.id.listViewDelete)).atPosition(0).perform(click());
    }
}
