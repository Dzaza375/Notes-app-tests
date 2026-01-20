package com.example.notesapp.data;

import java.util.List;

public interface NoteStorage {
    void saveNote(Note note);
    java.util.List<Note> getAllNotes();
    void deleteNote(String title);
}
