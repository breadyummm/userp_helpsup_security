package com.example.securty_helpsup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class h_a_s extends AppCompatActivity {

    private ImageButton BbackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_and_support);


        // Handle the back button click
        BbackButton = findViewById(R.id.BbackButton);
        BbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        // CardView 1
        CardView has_btn = findViewById(R.id.has_btn);
        has_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(h_a_s.this, r_prob1.class);
                startActivity(intent);
            }
        });

        // CardView 2
        CardView has_btn2 = findViewById(R.id.has_btn2);
        has_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(h_a_s.this, how_guide.class);
                startActivity(intent);
            }
        });

        // CardView 3
        CardView has_btn3 = findViewById(R.id.has_btn3);
        has_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(h_a_s.this, terms_policiesj.class);
                startActivity(intent);
            }
        });

        // CardView 4
        CardView has_btn4 = findViewById(R.id.has_btn4);
        has_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(h_a_s.this, s_check.class);
                startActivity(intent);
            }
        });
    }
}

