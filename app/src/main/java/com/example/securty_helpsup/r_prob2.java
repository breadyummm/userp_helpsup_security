package com.example.securty_helpsup;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.widget.Toast;

public class r_prob2 extends AppCompatActivity {

    private static final int REQUEST_PICK_MEDIA = 1;

    private EditText report;
    private ImageButton BbackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_prob2);

        report = findViewById(R.id.report);
        CardView up_ss = findViewById(R.id.up_ss);
        Button submitrep_btn = findViewById(R.id.submitrep_btn);
        Button cancel_btn = findViewById(R.id.cancel_btn);


        BbackButton = findViewById(R.id.BbackButton);

        BbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(r_prob2.this, r_prob1.class);
                startActivity(intent);
            }
        });


        up_ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the upload button click
                openMediaPicker();
            }
        });

        submitrep_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the save button click
                saveText();
                showToast("Submitted Successfully!");

            }
        });

        cancel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(r_prob2.this, r_prob1.class);
                startActivity(intent);
            }
        });
    }

    private void openMediaPicker() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/* video/*");
        startActivityForResult(intent, REQUEST_PICK_MEDIA);
    }

    private void saveText() {
        // Get the entered text from the EditText
        String enteredText = report.getText().toString();

        // TODO: Add your logic to save the text (e.g., to a database or file)

        // Show a message indicating the text has been saved
        // For now, we'll just print it to the console
        System.out.println("Text saved: " + enteredText);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_PICK_MEDIA && resultCode == RESULT_OK && data != null) {
            // Handle the result from the media picker (e.g., image or video selected)
            // For simplicity, we'll just print the selected media's URI to the console
            String selectedMediaUri = data.getDataString();
            System.out.println("Selected Media URI: " + selectedMediaUri);
        }
    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
