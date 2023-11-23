package com.example.epl498luxzio;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.epl498luxzio.R;
import com.example.epl498luxzio.databinding.FragmentSignUpScreenBinding;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import androidx.navigation.Navigation;

public class SignUpScreenFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;


    //NEW
    private FragmentSignUpScreenBinding binding;
    private EditText first_name, last_name, date_of_birth, phone_number, street_address, city, country, zip_postal_code, email_address, password, confirm_password;
    private Button sign_up_button;

    private FirebaseFirestore db;
    private CollectionReference usersCollection;
    private SimpleDateFormat dateFormat;

    public SignUpScreenFragment() {
        // Required empty public constructor
    }

    public static SignUpScreenFragment newInstance(String param1, String param2) {
        SignUpScreenFragment fragment = new SignUpScreenFragment();
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
        db = FirebaseFirestore.getInstance();
        usersCollection = db.collection("Users");
        dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_up_screen, container, false);

        // Find the Log In button in your layout
        Button logInButton = view.findViewById(R.id.login_button);

        // Set a click listener on the Log In button
        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Use Navigation to navigate to the LoginScreenFragment
                Navigation.findNavController(v).navigate(R.id.login_button);
            }
        });

        // Inflate the binding for this fragment
        binding = FragmentSignUpScreenBinding.inflate(inflater, container, false);

        // Initialize UI elements
        first_name = binding.firstName;
        last_name = binding.lastName;
        date_of_birth = binding.dateOfBirth;
        phone_number = binding.phoneNumber;
        street_address = binding.streetAddress;
        city = binding.city;
        country = binding.country;
        zip_postal_code = binding.zipPostalCode;
        email_address = binding.emailAddress;
        password = binding.password;
        confirm_password = binding.confirmPassword;

        sign_up_button = binding.signUpButton;

        // Define a click listener for the "Save" button
        sign_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input
                String firstName = first_name.getText().toString();
                String lastName = last_name.getText().toString();
                String dateOfBirth = date_of_birth.getText().toString();
                String phoneNumber = phone_number.getText().toString();
                String streetAddress = street_address.getText().toString();
                String city_ = city.getText().toString();
                String country_ = country.getText().toString();
                String zipPostalCode = zip_postal_code.getText().toString();
                String emailAddress = email_address.getText().toString();
                String password_ = password.getText().toString();
                String confirmPassword = confirm_password.getText().toString();

                // Validate the form fields
                if (validateFields(firstName, lastName, dateOfBirth, phoneNumber, streetAddress, city_, country_, zipPostalCode, emailAddress, password_, confirmPassword)) {
                    // Create a User object
                    User user = new User(firstName, lastName, dateOfBirth, phoneNumber, streetAddress, city_, country_, zipPostalCode, emailAddress, password_, confirmPassword);

                    // Add user data to Firestore
                    usersCollection.add(user)
                            .addOnSuccessListener(documentReference -> {
                                // Show a success message
                                Toast.makeText(requireContext(), "Your are account has been successfully created!", Toast.LENGTH_SHORT).show();

                                // Post a delayed action to navigate after 3 seconds
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
//                                    // Get the ID of the newly created user in Firestore
//                                    String documentReferenceId = documentReference.getId();
//
//                                    // Create a bundle to send the resource ID to the new fragment
//                                    Bundle bundle = new Bundle();
//                                    bundle.putString("documentReferenceId", documentReferenceId);
//
//                                    // Navigate to the UserViewInfoFragment with the bundle
//                                    NavHostFragment.findNavController(FirebaseFragment.this)
//                                            .navigate(R.id.action_FirebaseFragment_to_UserViewInfoFragment, bundle);

                                        // Navigate to the LoginScreenFragment
                                        Navigation.findNavController(v).navigate(R.id.sign_up_button);
                                    }
                                }, 3000); // 3000 milliseconds (3 seconds)

                                // Clear the form
                                clearForm();
                            })
                            .addOnFailureListener(e -> {
                                // Show a failure message
                                Toast.makeText(requireContext(), "Failure: your are account has not been created...", Toast.LENGTH_LONG).show();
                            });
                }
            }
        });

        return binding.getRoot();
    }

    private boolean validateFields(String first_name,
                                   String last_name,
                                   String date_of_birth,
                                   String phone_number,
                                   String street_address,
                                   String city,
                                   String country,
                                   String zip_postal_code,
                                   String email_address,
                                   String password,
                                   String confirm_password) {

        // Perform validation checks for required fields
        if (first_name.isEmpty()) {
            // Display an error message or highlight the field
            binding.firstName.setError("First name is required");
            return false;
        }

        if (last_name.isEmpty()) {
            // Display an error message or highlight the field
            binding.lastName.setError("Last name is required");
            return false;
        }

        if (date_of_birth.isEmpty()) {
            // Display an error message or highlight the field
            binding.dateOfBirth.setError("Date of Birth is required");
            return false;
        }

        if (phone_number.isEmpty()) {
            // Display an error message or highlight the field
            binding.phoneNumber.setError("Street Address is required");
            return false;
        }

        if (street_address.isEmpty()) {
            // Display an error message or highlight the field
            binding.streetAddress.setError("City is required");
            return false;
        }

        if (city.isEmpty()) {
            // Display an error message or highlight the field
            binding.city.setError("Country is required");
            return false;
        }

        if (country.isEmpty()) {
            // Display an error message or highlight the field
            binding.country.setError("Zip/Postal Code is required");
            return false;
        }

        if (zip_postal_code.isEmpty()) {
            // Display an error message or highlight the field
            binding.zipPostalCode.setError("First name is required");
            return false;
        }

        if (email_address.isEmpty()) {
            // Display an error message or highlight the field
            binding.emailAddress.setError("Email Address is required");
            return false;
        }

        if (password.isEmpty()) {
            // Display an error message or highlight the field
            binding.password.setError("Password is required");
            return false;
        }

        if (confirm_password.isEmpty()) {
            // Display an error message or highlight the field
            binding.confirmPassword.setError("Confirm Password is required");
            return false;
        }

        // Additional check for password and confirm password
        if (!password.equals(confirm_password)) {
            // Display an error message or highlight the fields
            binding.password.setError("Passwords do not match");
            binding.confirmPassword.setError("Passwords do not match");
            return false;
        }

        return true; // All required fields are filled
    }

    private void clearForm() {
        // Clear all EditText fields
        first_name.getText().clear();
        last_name.getText().clear();
        date_of_birth.getText().clear();
        phone_number.getText().clear();
        street_address.getText().clear();
        city.getText().clear();
        country.getText().clear();
        zip_postal_code.getText().clear();
        email_address.getText().clear();
        password.getText().clear();
        confirm_password.getText().clear();
    }
}
