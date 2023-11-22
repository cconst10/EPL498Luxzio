package com.example.epl498luxzio; // Replace with your actual package name

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class SettingsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings_activity, container, false);

        // Account Options
        Button btnChangePassword = view.findViewById(R.id.btnChangePassword);
        Button btnLogout = view.findViewById(R.id.btnLogout);
        Button btnLanguage = view.findViewById(R.id.btnLanguage);


        // Notifications Options
        RadioButton radioNotifications = view.findViewById(R.id.radioNotifications);
        RadioButton radioAppNotifications = view.findViewById(R.id.radioAppNotifications);



        // Set click listeners for buttons (no functionality, just transitioning to other screens)
        btnChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add functionality or transition logic
                Navigation.findNavController(v).navigate(R.id.btnChangePassword);
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add functionality or transition logic
                Navigation.findNavController(v).navigate(R.id.btnLogout);
            }
        });

        btnLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add functionality or transition logic
                Navigation.findNavController(v).navigate(R.id.btnLanguage);
            }
        });


        return view;
    }
}
