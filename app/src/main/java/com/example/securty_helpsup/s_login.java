package com.example.securty_helpsup;


import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class s_login extends AppCompatActivity {


    private Switch save_switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saved_login);

        save_switch = findViewById(R.id.save_switch);

        save_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Handle the switch state change
                if (isChecked) {
                    // Switch is ON
                    showToast("Switch is ON");
                    // Add your logic for when the switch is ON
                } else {
                    // Switch is OFF
                    showToast("Switch is OFF");
                    // Add your logic for when the switch is OFF
                }
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
