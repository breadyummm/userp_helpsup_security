package com.example.securty_helpsup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class s_check extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secu_check);

        // CardView 1
        CardView secu_btn1 = findViewById(R.id.secu_btn1);
        secu_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s_check.this, secu_pass.class);
                startActivity(intent);
            }
        });

        // CardView 2
        CardView secu_btn2 = findViewById(R.id.secu_btn2);
        secu_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s_check.this, secu_email.class);
                startActivity(intent);
            }
        });

        // CardView 3
        CardView secu_btn3 = findViewById(R.id.secu_btn3);
        secu_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s_check.this, secu_mnum.class);
                startActivity(intent);
            }
        });
    }
}