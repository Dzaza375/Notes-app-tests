package com.example.notesapp.data;

import android.content.Context;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class SharedPrefStorageTest {

    private SharedPrefStorage storage;

    @Before
    public void setUp() {
        Context context = ApplicationProvider.getApplicationContext();
        storage = new SharedPrefStorage(context);

        context.getSharedPreferences("notes_prefs", Context.MODE_PRIVATE)
                .edit()
                .clear()
                .apply();
    }

    @Test
    public void saveNote_noteIsSaved() {
        Note note = new Note("Test", "Content");

        storage.saveNote(note);

        List<Note> notes = storage.getAllNotes();
        assertEquals(1, notes.size());
        assertEquals("Test", notes.get(0).getTitle());
        assertEquals("Content", notes.get(0).getContent());
    }

    @Test
    public void deleteNote_noteIsRemoved() {
        storage.saveNote(new Note("Test", "Content"));

        storage.deleteNote("Test");

        List<Note> notes = storage.getAllNotes();
        assertTrue(notes.isEmpty());
    }
}
