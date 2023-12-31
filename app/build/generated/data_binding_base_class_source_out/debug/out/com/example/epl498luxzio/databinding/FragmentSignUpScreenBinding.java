// Generated by view binder compiler. Do not edit!
package com.example.epl498luxzio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.epl498luxzio.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSignUpScreenBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView alreadyHaveAnAccount;

  @NonNull
  public final EditText city;

  @NonNull
  public final EditText confirmPassword;

  @NonNull
  public final EditText country;

  @NonNull
  public final TextView createAccount;

  @NonNull
  public final EditText dateOfBirth;

  @NonNull
  public final EditText emailAddress;

  @NonNull
  public final EditText firstName;

  @NonNull
  public final EditText lastName;

  @NonNull
  public final View lineLeft;

  @NonNull
  public final View lineRight;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final EditText password;

  @NonNull
  public final EditText phoneNumber;

  @NonNull
  public final Button signUpButton;

  @NonNull
  public final EditText streetAddress;

  @NonNull
  public final TextView toGetStartedNow;

  @NonNull
  public final EditText zipPostalCode;

  private FragmentSignUpScreenBinding(@NonNull FrameLayout rootView,
      @NonNull TextView alreadyHaveAnAccount, @NonNull EditText city,
      @NonNull EditText confirmPassword, @NonNull EditText country, @NonNull TextView createAccount,
      @NonNull EditText dateOfBirth, @NonNull EditText emailAddress, @NonNull EditText firstName,
      @NonNull EditText lastName, @NonNull View lineLeft, @NonNull View lineRight,
      @NonNull Button loginButton, @NonNull EditText password, @NonNull EditText phoneNumber,
      @NonNull Button signUpButton, @NonNull EditText streetAddress,
      @NonNull TextView toGetStartedNow, @NonNull EditText zipPostalCode) {
    this.rootView = rootView;
    this.alreadyHaveAnAccount = alreadyHaveAnAccount;
    this.city = city;
    this.confirmPassword = confirmPassword;
    this.country = country;
    this.createAccount = createAccount;
    this.dateOfBirth = dateOfBirth;
    this.emailAddress = emailAddress;
    this.firstName = firstName;
    this.lastName = lastName;
    this.lineLeft = lineLeft;
    this.lineRight = lineRight;
    this.loginButton = loginButton;
    this.password = password;
    this.phoneNumber = phoneNumber;
    this.signUpButton = signUpButton;
    this.streetAddress = streetAddress;
    this.toGetStartedNow = toGetStartedNow;
    this.zipPostalCode = zipPostalCode;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSignUpScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSignUpScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_sign_up_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSignUpScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.already_have_an_account;
      TextView alreadyHaveAnAccount = ViewBindings.findChildViewById(rootView, id);
      if (alreadyHaveAnAccount == null) {
        break missingId;
      }

      id = R.id.city;
      EditText city = ViewBindings.findChildViewById(rootView, id);
      if (city == null) {
        break missingId;
      }

      id = R.id.confirm_password;
      EditText confirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (confirmPassword == null) {
        break missingId;
      }

      id = R.id.country;
      EditText country = ViewBindings.findChildViewById(rootView, id);
      if (country == null) {
        break missingId;
      }

      id = R.id.create_account;
      TextView createAccount = ViewBindings.findChildViewById(rootView, id);
      if (createAccount == null) {
        break missingId;
      }

      id = R.id.date_of_birth;
      EditText dateOfBirth = ViewBindings.findChildViewById(rootView, id);
      if (dateOfBirth == null) {
        break missingId;
      }

      id = R.id.email_address;
      EditText emailAddress = ViewBindings.findChildViewById(rootView, id);
      if (emailAddress == null) {
        break missingId;
      }

      id = R.id.first_name;
      EditText firstName = ViewBindings.findChildViewById(rootView, id);
      if (firstName == null) {
        break missingId;
      }

      id = R.id.last_name;
      EditText lastName = ViewBindings.findChildViewById(rootView, id);
      if (lastName == null) {
        break missingId;
      }

      id = R.id.line_left;
      View lineLeft = ViewBindings.findChildViewById(rootView, id);
      if (lineLeft == null) {
        break missingId;
      }

      id = R.id.line_right;
      View lineRight = ViewBindings.findChildViewById(rootView, id);
      if (lineRight == null) {
        break missingId;
      }

      id = R.id.login_button;
      Button loginButton = ViewBindings.findChildViewById(rootView, id);
      if (loginButton == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.phone_number;
      EditText phoneNumber = ViewBindings.findChildViewById(rootView, id);
      if (phoneNumber == null) {
        break missingId;
      }

      id = R.id.sign_up_button;
      Button signUpButton = ViewBindings.findChildViewById(rootView, id);
      if (signUpButton == null) {
        break missingId;
      }

      id = R.id.street_address;
      EditText streetAddress = ViewBindings.findChildViewById(rootView, id);
      if (streetAddress == null) {
        break missingId;
      }

      id = R.id.to_get_started_now;
      TextView toGetStartedNow = ViewBindings.findChildViewById(rootView, id);
      if (toGetStartedNow == null) {
        break missingId;
      }

      id = R.id.zip_postal_code;
      EditText zipPostalCode = ViewBindings.findChildViewById(rootView, id);
      if (zipPostalCode == null) {
        break missingId;
      }

      return new FragmentSignUpScreenBinding((FrameLayout) rootView, alreadyHaveAnAccount, city,
          confirmPassword, country, createAccount, dateOfBirth, emailAddress, firstName, lastName,
          lineLeft, lineRight, loginButton, password, phoneNumber, signUpButton, streetAddress,
          toGetStartedNow, zipPostalCode);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
