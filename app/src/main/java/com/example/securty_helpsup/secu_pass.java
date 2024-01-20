package com.example.securty_helpsup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class secu_pass extends AppCompatActivity {

    private ImageButton BbackButton;
    private Button save_btn;
    private EditText snew_pass, sre_new_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sec_pass);

        BbackButton = findViewById(R.id.BbackButton);
        snew_pass = findViewById(R.id.snew_pass);
        sre_new_pass = findViewById(R.id.sre_new_pass);
        save_btn = findViewById(R.id.save_btn);

        BbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secu_pass.this, s_check.class);
                startActivity(intent);
            }
        });


        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newPassword = snew_pass.getText().toString();
                String retypePassword = sre_new_pass.getText().toString();

                if (newPassword.equals(retypePassword)) {

                    showToast("Passwords match");

                    // database ; save the password or proceed with further actions

                } else {
                    sre_new_pass.setError("Passwords do not match");
                    sre_new_pass.requestFocus();
                }
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}






