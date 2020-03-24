package pt.ulisboa.tecnico.sise.lab02.dummynotepad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);

        // you can use the first argument “SISELOG” to filter log messages in the logcat panel
        Log.d("SISELOG", "This is my first debugging message.");

        final Button button = findViewById(R.id.okButton);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                EditText title = findViewById(R.id.NoteTitleEditText);
                Log.d("SISELOG", title.getText().toString());

                EditText note = findViewById(R.id.NoteBodyEditText);
                Log.d("SISELOG", note.getText().toString());

                button.setText(title.getText().toString());

                Toast.makeText(v.getContext(), "The button name has been changed!", Toast.LENGTH_SHORT).show(); // where v is the View parameter

            }
        });

    }

}
