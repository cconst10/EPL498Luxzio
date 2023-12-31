// Generated by view binder compiler. Do not edit!
package com.example.epl498luxzio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
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
  private final ScrollView rootView;

  @NonNull
  public final EditText adultsChildrenRoomsField;

  @NonNull
  public final ImageView amarandeHotel;

  @NonNull
  public final TextView amarandeHotelText;

  @NonNull
  public final ImageView apartments;

  @NonNull
  public final ImageView appLogo;

  @NonNull
  public final TextView bestQualityHotelsInCyprus;

  @NonNull
  public final EditText checkInDateField;

  @NonNull
  public final EditText checkOutDateField;

  @NonNull
  public final RelativeLayout darkPurpleSection;

  @NonNull
  public final RelativeLayout darkerGrayishPurpleSection;

  @NonNull
  public final ImageView elysiumHotel;

  @NonNull
  public final TextView elysiumHotelText;

  @NonNull
  public final EditText enterLocationField;

  @NonNull
  public final TextView findByPropertyType;

  @NonNull
  public final ImageView fourSeasonsHotel;

  @NonNull
  public final TextView fourSeasonsHotelText;

  @NonNull
  public final ImageView hotels;

  @NonNull
  public final ImageView olympicLagoonResorts;

  @NonNull
  public final TextView olympicLagoonResortsText;

  @NonNull
  public final Button searchButton;

  @NonNull
  public final ImageView settingsbutton;

  @NonNull
  public final ImageView villas;

  private FragmentHomePageBinding(@NonNull ScrollView rootView,
      @NonNull EditText adultsChildrenRoomsField, @NonNull ImageView amarandeHotel,
      @NonNull TextView amarandeHotelText, @NonNull ImageView apartments,
      @NonNull ImageView appLogo, @NonNull TextView bestQualityHotelsInCyprus,
      @NonNull EditText checkInDateField, @NonNull EditText checkOutDateField,
      @NonNull RelativeLayout darkPurpleSection, @NonNull RelativeLayout darkerGrayishPurpleSection,
      @NonNull ImageView elysiumHotel, @NonNull TextView elysiumHotelText,
      @NonNull EditText enterLocationField, @NonNull TextView findByPropertyType,
      @NonNull ImageView fourSeasonsHotel, @NonNull TextView fourSeasonsHotelText,
      @NonNull ImageView hotels, @NonNull ImageView olympicLagoonResorts,
      @NonNull TextView olympicLagoonResortsText, @NonNull Button searchButton,
      @NonNull ImageView settingsbutton, @NonNull ImageView villas) {
    this.rootView = rootView;
    this.adultsChildrenRoomsField = adultsChildrenRoomsField;
    this.amarandeHotel = amarandeHotel;
    this.amarandeHotelText = amarandeHotelText;
    this.apartments = apartments;
    this.appLogo = appLogo;
    this.bestQualityHotelsInCyprus = bestQualityHotelsInCyprus;
    this.checkInDateField = checkInDateField;
    this.checkOutDateField = checkOutDateField;
    this.darkPurpleSection = darkPurpleSection;
    this.darkerGrayishPurpleSection = darkerGrayishPurpleSection;
    this.elysiumHotel = elysiumHotel;
    this.elysiumHotelText = elysiumHotelText;
    this.enterLocationField = enterLocationField;
    this.findByPropertyType = findByPropertyType;
    this.fourSeasonsHotel = fourSeasonsHotel;
    this.fourSeasonsHotelText = fourSeasonsHotelText;
    this.hotels = hotels;
    this.olympicLagoonResorts = olympicLagoonResorts;
    this.olympicLagoonResortsText = olympicLagoonResortsText;
    this.searchButton = searchButton;
    this.settingsbutton = settingsbutton;
    this.villas = villas;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
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
      id = R.id.adultsChildrenRoomsField;
      EditText adultsChildrenRoomsField = ViewBindings.findChildViewById(rootView, id);
      if (adultsChildrenRoomsField == null) {
        break missingId;
      }

      id = R.id.amarande_hotel;
      ImageView amarandeHotel = ViewBindings.findChildViewById(rootView, id);
      if (amarandeHotel == null) {
        break missingId;
      }

      id = R.id.amarande_hotel_text;
      TextView amarandeHotelText = ViewBindings.findChildViewById(rootView, id);
      if (amarandeHotelText == null) {
        break missingId;
      }

      id = R.id.apartments;
      ImageView apartments = ViewBindings.findChildViewById(rootView, id);
      if (apartments == null) {
        break missingId;
      }

      id = R.id.appLogo;
      ImageView appLogo = ViewBindings.findChildViewById(rootView, id);
      if (appLogo == null) {
        break missingId;
      }

      id = R.id.best_quality_hotels_in_cyprus;
      TextView bestQualityHotelsInCyprus = ViewBindings.findChildViewById(rootView, id);
      if (bestQualityHotelsInCyprus == null) {
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

      id = R.id.elysium_hotel;
      ImageView elysiumHotel = ViewBindings.findChildViewById(rootView, id);
      if (elysiumHotel == null) {
        break missingId;
      }

      id = R.id.elysium_hotel_text;
      TextView elysiumHotelText = ViewBindings.findChildViewById(rootView, id);
      if (elysiumHotelText == null) {
        break missingId;
      }

      id = R.id.enterLocationField;
      EditText enterLocationField = ViewBindings.findChildViewById(rootView, id);
      if (enterLocationField == null) {
        break missingId;
      }

      id = R.id.find_by_property_type;
      TextView findByPropertyType = ViewBindings.findChildViewById(rootView, id);
      if (findByPropertyType == null) {
        break missingId;
      }

      id = R.id.four_seasons_hotel;
      ImageView fourSeasonsHotel = ViewBindings.findChildViewById(rootView, id);
      if (fourSeasonsHotel == null) {
        break missingId;
      }

      id = R.id.four_seasons_hotel_text;
      TextView fourSeasonsHotelText = ViewBindings.findChildViewById(rootView, id);
      if (fourSeasonsHotelText == null) {
        break missingId;
      }

      id = R.id.hotels;
      ImageView hotels = ViewBindings.findChildViewById(rootView, id);
      if (hotels == null) {
        break missingId;
      }

      id = R.id.olympic_lagoon_resorts;
      ImageView olympicLagoonResorts = ViewBindings.findChildViewById(rootView, id);
      if (olympicLagoonResorts == null) {
        break missingId;
      }

      id = R.id.olympic_lagoon_resorts_text;
      TextView olympicLagoonResortsText = ViewBindings.findChildViewById(rootView, id);
      if (olympicLagoonResortsText == null) {
        break missingId;
      }

      id = R.id.search_button;
      Button searchButton = ViewBindings.findChildViewById(rootView, id);
      if (searchButton == null) {
        break missingId;
      }

      id = R.id.settingsbutton;
      ImageView settingsbutton = ViewBindings.findChildViewById(rootView, id);
      if (settingsbutton == null) {
        break missingId;
      }

      id = R.id.villas;
      ImageView villas = ViewBindings.findChildViewById(rootView, id);
      if (villas == null) {
        break missingId;
      }

      return new FragmentHomePageBinding((ScrollView) rootView, adultsChildrenRoomsField,
          amarandeHotel, amarandeHotelText, apartments, appLogo, bestQualityHotelsInCyprus,
          checkInDateField, checkOutDateField, darkPurpleSection, darkerGrayishPurpleSection,
          elysiumHotel, elysiumHotelText, enterLocationField, findByPropertyType, fourSeasonsHotel,
          fourSeasonsHotelText, hotels, olympicLagoonResorts, olympicLagoonResortsText,
          searchButton, settingsbutton, villas);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
