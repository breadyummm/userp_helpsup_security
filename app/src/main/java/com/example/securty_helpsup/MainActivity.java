package com.example.securty_helpsup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    private ImageButton BbackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Handle the back button click
        BbackButton = findViewById(R.id.BbackButton);
        BbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        // CardView 1
        CardView p_s_btn = findViewById(R.id.p_s_btn);
        p_s_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, c_pass.class);
                startActivity(intent);
            }
        });

        // CardView 2
        CardView p_s_btn2 = findViewById(R.id.p_s_btn2);
        p_s_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, s_login.class);
                startActivity(intent);
            }
        });

        // CardView 3
        CardView p_s_btn3 = findViewById(R.id.p_s_btn3);
        p_s_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, s_check.class);
                startActivity(intent);
            }
        });
    }
}
