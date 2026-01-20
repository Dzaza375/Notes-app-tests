package com.example.notesapp.data;

import org.junit.Test;
import static org.junit.Assert.*;

public class NoteTest {

    @Test
    public void constructor_setsTitleAndContent() {
        Note note = new Note("Title", "Content");

        assertEquals("Title", note.getTitle());
        assertEquals("Content", note.getContent());
    }
}
