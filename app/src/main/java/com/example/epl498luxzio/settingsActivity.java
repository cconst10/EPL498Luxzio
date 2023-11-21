package com.example.epl498luxzio; // Replace with your actual package name

import static com.example.epl498luxzio.R.layout.fragment_settings_activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.epl498luxzio.R;

public class settingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(fragment_settings_activity);


        // Account Options
        Button btnEditProfile = findViewById(R.id.btnEditProfile);
        Button btnChangePassword = findViewById(R.id.btnChangePassword);
        Button btnDataPrivacy = findViewById(R.id.btnDataPrivacy);

        // Notifications Options
        RadioButton radioNotifications = findViewById(R.id.radioNotifications);
        RadioButton radioAppNotifications = findViewById(R.id.radioAppNotifications);

        // More Options
        Button btnLanguage = findViewById(R.id.btnLanguage);
        Button btnLocation = findViewById(R.id.btnLocation);

        // Set click listeners for buttons (no functionality, just transitioning to other screens)
        btnEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add functionality or transition logic
            }
        });

        btnChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add functionality or transition logic
            }
        });

        btnDataPrivacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add functionality or transition logic
            }
        });

        btnLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add functionality or transition logic
            }
        });

        btnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add functionality or transition logic
            }
        });
    }
}
