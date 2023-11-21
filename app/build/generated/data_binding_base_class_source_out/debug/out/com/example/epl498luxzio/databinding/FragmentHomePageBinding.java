// Generated by view binder compiler. Do not edit!
package com.example.epl498luxzio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.epl498luxzio.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomePageBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final EditText SearchSubmitButton;

  @NonNull
  public final EditText adultsChildrenRoomsField;

  @NonNull
  public final ImageView appLogo;

  @NonNull
  public final EditText checkInDateField;

  @NonNull
  public final EditText checkOutDateField;

  @NonNull
  public final RelativeLayout darkPurpleSection;

  @NonNull
  public final RelativeLayout darkerGrayishPurpleSection;

  @NonNull
  public final EditText enterLocationField;

  @NonNull
  public final TextView findbytype;

  @NonNull
  public final ImageView hotel1;

  @NonNull
  public final TextView hotel1text;

  @NonNull
  public final ImageView hotel2;

  @NonNull
  public final TextView hotel2text;

  @NonNull
  public final ImageView hotel3;

  @NonNull
  public final TextView hotel3text;

  @NonNull
  public final ImageView hotel4;

  @NonNull
  public final TextView hotel4text;

  @NonNull
  public final ImageView settingsbutton;

  @NonNull
  public final ImageView type1;

  @NonNull
  public final ImageView type2;

  @NonNull
  public final ImageView type3;

  @NonNull
  public final View whiteSection;

  private FragmentHomePageBinding(@NonNull FrameLayout rootView,
      @NonNull EditText SearchSubmitButton, @NonNull EditText adultsChildrenRoomsField,
      @NonNull ImageView appLogo, @NonNull EditText checkInDateField,
      @NonNull EditText checkOutDateField, @NonNull RelativeLayout darkPurpleSection,
      @NonNull RelativeLayout darkerGrayishPurpleSection, @NonNull EditText enterLocationField,
      @NonNull TextView findbytype, @NonNull ImageView hotel1, @NonNull TextView hotel1text,
      @NonNull ImageView hotel2, @NonNull TextView hotel2text, @NonNull ImageView hotel3,
      @NonNull TextView hotel3text, @NonNull ImageView hotel4, @NonNull TextView hotel4text,
      @NonNull ImageView settingsbutton, @NonNull ImageView type1, @NonNull ImageView type2,
      @NonNull ImageView type3, @NonNull View whiteSection) {
    this.rootView = rootView;
    this.SearchSubmitButton = SearchSubmitButton;
    this.adultsChildrenRoomsField = adultsChildrenRoomsField;
    this.appLogo = appLogo;
    this.checkInDateField = checkInDateField;
    this.checkOutDateField = checkOutDateField;
    this.darkPurpleSection = darkPurpleSection;
    this.darkerGrayishPurpleSection = darkerGrayishPurpleSection;
    this.enterLocationField = enterLocationField;
    this.findbytype = findbytype;
    this.hotel1 = hotel1;
    this.hotel1text = hotel1text;
    this.hotel2 = hotel2;
    this.hotel2text = hotel2text;
    this.hotel3 = hotel3;
    this.hotel3text = hotel3text;
    this.hotel4 = hotel4;
    this.hotel4text = hotel4text;
    this.settingsbutton = settingsbutton;
    this.type1 = type1;
    this.type2 = type2;
    this.type3 = type3;
    this.whiteSection = whiteSection;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomePageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomePageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.SearchSubmitButton;
      EditText SearchSubmitButton = ViewBindings.findChildViewById(rootView, id);
      if (SearchSubmitButton == null) {
        break missingId;
      }

      id = R.id.adultsChildrenRoomsField;
      EditText adultsChildrenRoomsField = ViewBindings.findChildViewById(rootView, id);
      if (adultsChildrenRoomsField == null) {
        break missingId;
      }

      id = R.id.appLogo;
      ImageView appLogo = ViewBindings.findChildViewById(rootView, id);
      if (appLogo == null) {
        break missingId;
      }

      id = R.id.checkInDateField;
      EditText checkInDateField = ViewBindings.findChildViewById(rootView, id);
      if (checkInDateField == null) {
        break missingId;
      }

      id = R.id.checkOutDateField;
      EditText checkOutDateField = ViewBindings.findChildViewById(rootView, id);
      if (checkOutDateField == null) {
        break missingId;
      }

      id = R.id.darkPurpleSection;
      RelativeLayout darkPurpleSection = ViewBindings.findChildViewById(rootView, id);
      if (darkPurpleSection == null) {
        break missingId;
      }

      id = R.id.darkerGrayishPurpleSection;
      RelativeLayout darkerGrayishPurpleSection = ViewBindings.findChildViewById(rootView, id);
      if (darkerGrayishPurpleSection == null) {
        break missingId;
      }

      id = R.id.enterLocationField;
      EditText enterLocationField = ViewBindings.findChildViewById(rootView, id);
      if (enterLocationField == null) {
        break missingId;
      }

      id = R.id.findbytype;
      TextView findbytype = ViewBindings.findChildViewById(rootView, id);
      if (findbytype == null) {
        break missingId;
      }

      id = R.id.hotel1;
      ImageView hotel1 = ViewBindings.findChildViewById(rootView, id);
      if (hotel1 == null) {
        break missingId;
      }

      id = R.id.hotel1text;
      TextView hotel1text = ViewBindings.findChildViewById(rootView, id);
      if (hotel1text == null) {
        break missingId;
      }

      id = R.id.hotel2;
      ImageView hotel2 = ViewBindings.findChildViewById(rootView, id);
      if (hotel2 == null) {
        break missingId;
      }

      id = R.id.hotel2text;
      TextView hotel2text = ViewBindings.findChildViewById(rootView, id);
      if (hotel2text == null) {
        break missingId;
      }

      id = R.id.hotel3;
      ImageView hotel3 = ViewBindings.findChildViewById(rootView, id);
      if (hotel3 == null) {
        break missingId;
      }

      id = R.id.hotel3text;
      TextView hotel3text = ViewBindings.findChildViewById(rootView, id);
      if (hotel3text == null) {
        break missingId;
      }

      id = R.id.hotel4;
      ImageView hotel4 = ViewBindings.findChildViewById(rootView, id);
      if (hotel4 == null) {
        break missingId;
      }

      id = R.id.hotel4text;
      TextView hotel4text = ViewBindings.findChildViewById(rootView, id);
      if (hotel4text == null) {
        break missingId;
      }

      id = R.id.settingsbutton;
      ImageView settingsbutton = ViewBindings.findChildViewById(rootView, id);
      if (settingsbutton == null) {
        break missingId;
      }

      id = R.id.type1;
      ImageView type1 = ViewBindings.findChildViewById(rootView, id);
      if (type1 == null) {
        break missingId;
      }

      id = R.id.type2;
      ImageView type2 = ViewBindings.findChildViewById(rootView, id);
      if (type2 == null) {
        break missingId;
      }

      id = R.id.type3;
      ImageView type3 = ViewBindings.findChildViewById(rootView, id);
      if (type3 == null) {
        break missingId;
      }

      id = R.id.whiteSection;
      View whiteSection = ViewBindings.findChildViewById(rootView, id);
      if (whiteSection == null) {
        break missingId;
      }

      return new FragmentHomePageBinding((FrameLayout) rootView, SearchSubmitButton,
          adultsChildrenRoomsField, appLogo, checkInDateField, checkOutDateField, darkPurpleSection,
          darkerGrayishPurpleSection, enterLocationField, findbytype, hotel1, hotel1text, hotel2,
          hotel2text, hotel3, hotel3text, hotel4, hotel4text, settingsbutton, type1, type2, type3,
          whiteSection);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
