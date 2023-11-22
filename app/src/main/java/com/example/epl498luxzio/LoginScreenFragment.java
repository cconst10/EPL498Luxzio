package com.example.epl498luxzio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class LoginScreenFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public LoginScreenFragment() {
        // Required empty public constructor
    }

    public static LoginScreenFragment newInstance(String param1, String param2) {
        LoginScreenFragment fragment = new LoginScreenFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login_screen, container, false);

        // Find the Sign Up button in your layout
        Button signUpButton = view.findViewById(R.id.sign_up_button);

        // Set a click listener on the Sign Up button
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use Navigation to navigate to the SignUpScreenFragment
                Navigation.findNavController(v).navigate(R.id.sign_up_button);
            }
        });

        // Find the Log In button in your layout
        Button logInButton = view.findViewById(R.id.login_button);

        // Set a click listener on the Log In button
        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use Navigation to navigate to the HomePageFragment
                Navigation.findNavController(v).navigate(R.id.login_button);
            }
        });

        return view;
    }
}
