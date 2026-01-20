package com.example.notesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.notesapp.data.Note;
import com.example.notesapp.data.NoteStorage;
import com.example.notesapp.data.SharedPrefStorage;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView notesListView;
    private NoteStorage storage;
    private ArrayAdapter<String> adapter;
    private List<Note> notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notesListView = findViewById(R.id.notesListView);
        storage = new SharedPrefStorage(this);

        loadNotes();
    }

    private void loadNotes() {
        notes = storage.getAllNotes();
        List<String> titles = new ArrayList<>();
        for (Note note : notes) {
            titles.add(note.getTitle());
        }
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                titles);
        notesListView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.menu_add_note) {
            startActivity(new Intent(this, AddNoteActivity.class));
            return true;
        } else if (itemId == R.id.menu_delete_note) {
            startActivity(new Intent(this, DeleteNoteActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadNotes();
    }
}
