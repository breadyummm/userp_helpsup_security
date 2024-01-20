package com.example.securty_helpsup;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;


public class c_pass extends AppCompatActivity {

    private EditText new_pass, re_new_pass;
    private Button save_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_pass);

        new_pass = findViewById(R.id.new_pass);
        re_new_pass = findViewById(R.id.re_new_pass);
        save_btn = findViewById(R.id.save_btn);

        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newPassword = new_pass.getText().toString();
                String retypePassword = re_new_pass.getText().toString();

                if (newPassword.equals(retypePassword)) {

                    showToast("Passwords match");

                    // database ; save the password or proceed with further actions

                } else {
                    re_new_pass.setError("Passwords do not match");
                    re_new_pass.requestFocus();
                }
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}


