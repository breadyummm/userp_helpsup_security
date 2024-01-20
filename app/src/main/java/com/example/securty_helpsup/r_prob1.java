package com.example.securty_helpsup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class r_prob1 extends AppCompatActivity {

    private ImageButton BbackButton;
    private Button sub_rep_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_prob1);

        BbackButton = findViewById(R.id.BbackButton);
        sub_rep_btn = findViewById(R.id.sub_rep_btn);

        BbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        sub_rep_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(r_prob1.this, c_pass.class);
                startActivity(intent);
            }
        });



    }}
