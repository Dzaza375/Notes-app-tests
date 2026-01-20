package com.example.notesapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.notesapp.data.Note;
import com.example.notesapp.data.NoteStorage;
import com.example.notesapp.data.SharedPrefStorage;

public class AddNoteActivity extends AppCompatActivity {

    private EditText txtTitle, txtContent;
    private NoteStorage storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        txtTitle = findViewById(R.id.txtTitle);
        txtContent = findViewById(R.id.txtContent);
        storage = new SharedPrefStorage(this);
    }

    public void onSaveClick(View view) {
        String title = txtTitle.getText().toString().trim();
        String content = txtContent.getText().toString().trim();

        if (title.isEmpty() || content.isEmpty()) {
            Toast.makeText(this, getString(R.string.warning_empty), Toast.LENGTH_SHORT).show();
            return;
        }

        storage.saveNote(new Note(title, content));
        Toast.makeText(this, getString(R.string.note_added), Toast.LENGTH_SHORT).show();
        finish();
    }
}
