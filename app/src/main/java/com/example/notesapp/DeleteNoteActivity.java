package com.example.notesapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.notesapp.data.Note;
import com.example.notesapp.data.NoteStorage;
import com.example.notesapp.data.SharedPrefStorage;
import java.util.ArrayList;
import java.util.List;

public class DeleteNoteActivity extends AppCompatActivity {

    private ListView listView;
    private NoteStorage storage;
    private List<Note> notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_note);
        listView = findViewById(R.id.listViewDelete);
        storage = new SharedPrefStorage(this);
        loadNotes();
    }

    private void loadNotes() {
        notes = storage.getAllNotes();
        List<String> titles = new ArrayList<>();
        for (Note note : notes) {
            titles.add(note.getTitle());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, titles);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            String title = notes.get(i).getTitle();
            storage.deleteNote(title);
            Toast.makeText(this, getString(R.string.note_deleted), Toast.LENGTH_SHORT).show();
            loadNotes();
        });
    }
}
