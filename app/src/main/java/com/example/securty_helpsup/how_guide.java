package com.example.securty_helpsup;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class how_guide extends AppCompatActivity {

    private ImageButton BbackButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_to_g);

        BbackButton = findViewById(R.id.BbackButton);

        BbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(how_guide.this, h_a_s.class);
                startActivity(intent);
            }
        });

    }
}
