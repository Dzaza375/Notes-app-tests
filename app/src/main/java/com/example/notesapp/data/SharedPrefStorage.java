package com.example.notesapp.data;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class SharedPrefStorage implements NoteStorage {
    private static final String PREF_NAME = "notes_prefs";
    private static final String KEY_NOTES = "notes";
    private SharedPreferences sharedPreferences;

    public SharedPrefStorage(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    @Override
    public void saveNote(Note note) {
        List<Note> notes = getAllNotes();
        notes.add(note);
        saveToPrefs(notes);
    }

    @Override
    public List<Note> getAllNotes() {
        String json = sharedPreferences.getString(KEY_NOTES, "[]");
        List<Note> notes = new ArrayList<>();
        try {
            JSONArray array = new JSONArray(json);
            for (int i = 0; i < array.length(); i++) {
                JSONObject obj = array.getJSONObject(i);
                notes.add(new Note(obj.getString("title"), obj.getString("content")));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return notes;
    }

    @Override
    public void deleteNote(String title) {
        List<Note> notes = getAllNotes();
        java.util.Iterator<Note> it = notes.iterator();
        while (it.hasNext()) {
            if (it.next().getTitle().equals(title)) {
                it.remove();
                break;
            }
        }
        saveToPrefs(notes);
    }

    private void saveToPrefs(List<Note> notes) {
        JSONArray array = new JSONArray();
        for (Note note : notes) {
            JSONObject obj = new JSONObject();
            try {
                obj.put("title", note.getTitle());
                obj.put("content", note.getContent());
                array.put(obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        sharedPreferences.edit().putString(KEY_NOTES, array.toString()).apply();
    }
}
