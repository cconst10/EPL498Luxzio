package com.example.epl498luxzio;

import static android.content.ContentValues.TAG;

import android.Manifest;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class MapFragment extends Fragment implements OnMapReadyCallback, GoogleMap.OnInfoWindowClickListener {

    private GoogleMap mMap;

    // Declare the ActivityResultLauncher for requesting permissions
    private ActivityResultLauncher<String[]> requestPermissionLauncher;

    private FirebaseFirestore db;
    private CollectionReference mapsHotelCollection;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db = FirebaseFirestore.getInstance();
        mapsHotelCollection = db.collection("Hotels");

        // Initialize the ActivityResultLauncher to request location permissions
        requestPermissionLauncher = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), permissionsResult -> {
            if (permissionsResult.get(Manifest.permission.ACCESS_FINE_LOCATION) == Boolean.TRUE) {
                // Location permission granted, proceed with your code
            } else {
                Toast.makeText(requireContext(), "Location permission denied", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_map, container, false);

        // Initialize the MapView
        MapView mapView = rootView.findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.onResume();
        mapView.getMapAsync(this);

        return rootView;
    }

    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap; // Initialize mMap only once

        String[] hotelNames = {"Four Seasons Hotel", "Elysium Hotel", "Olympic Lagoon Resorts", "Aphrodite Hills Golf & Spa Resort Residences", "Anassa Hotel"};

        final LatLng[] firstLocation = {null}; // Initialize to null

        for (String name : hotelNames) {
            mapsHotelCollection.whereEqualTo("name", name)
                    .get()
                    .addOnSuccessListener(queryDocumentSnapshots -> {
                        for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
                            // Parse data from Firestore
                            double latitude = document.getDouble("latitude");
                            double longitude = document.getDouble("longitude");

                            // Add a marker for the hotel location
                            LatLng loc = new LatLng(latitude, longitude);
                            mMap.addMarker(new MarkerOptions().position(loc).title(name));

                            // Set firstLocation if not set
                            if (firstLocation[0] == null) {
                                firstLocation[0] = loc;
                            }

                            // Check location permission before drawing geofences and adding them
                            checkLocationPermission();
                        }

                        // Move camera only once (to the first marker)
                        if (firstLocation[0] != null) {
                            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(firstLocation[0], 8));

                            // Enable "My Location" layer after moving the camera
                            mMap.setMyLocationEnabled(true);
                        }
                    })
                    .addOnFailureListener(e -> {
                        Toast.makeText(requireContext(), "Hotel not found: " + name, Toast.LENGTH_SHORT).show();
                        // Handle errors while fetching data
                    });
        }

//        mMap.setOnMarkerClickListener(marker -> {
//            // Extract the hotel name from the clicked marker
//            String hotelName = marker.getTitle();
//
//            // Navigate to a new fragment with the details of the selected hotel
//            navigateToHotelDetailsFragment(hotelName);
//
//            return true; // Return true to consume the event
//        });
    }

//    private void navigateToHotelDetailsFragment(String hotelName) {
//        // Assuming you have a Firestore instance and a CollectionReference for your hotels
//        FirebaseFirestore db = FirebaseFirestore.getInstance();
//        CollectionReference hotelsCollection = db.collection("Hotels");
//
//        // The name of the hotel you want to search for
//        String name = hotelName;
//
//        AtomicReference<String> documentId = new AtomicReference<>("");
//
//        // Perform the query
//        hotelsCollection.whereEqualTo("name", name)
//                .get()
//                .addOnSuccessListener(queryDocumentSnapshots -> {
//                    for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
//                        // Retrieve the document ID
//                        documentId.set(document.getId());
//
//                        // Handle the document here
//                        // For example, you can retrieve data using document.getData()
//                        Map<String, Object> hotelData = document.getData();
//
//                        // Now 'hotelData' contains the data of the document matching the query
//                        // You can use this data to display information about the hotel or perform further actions
//                    }
//                })
//                .addOnFailureListener(e -> {
//                    // Handle failures
//                    Log.e(TAG, "Error getting documents: ", e);
//                });
//
//
//        String documentReferenceId = documentId.get();
//
//        // Create a bundle to send the resource ID to the new fragment
//        Bundle bundle = new Bundle();
//        bundle.putString("documentReferenceId", documentReferenceId);
//
//        // Navigate to the AboutPageFragment with the bundle
//        //NavHostFragment.findNavController(MapFragment.this).navigate(R.id.action_FirebaseFragment_to_UserViewInfoFragment, bundle);
//
//        // Create a new instance of HotelDetailsFragment
//        AboutPageFragment aboutPageFragment = AboutPageFragment.newInstance(documentReferenceId);
//
//        // Start a FragmentTransaction to replace the current fragment with the new one
//        FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
//        transaction.replace(R.id.aboutPage, aboutPageFragment);
//        transaction.addToBackStack(null); // Add to back stack so the user can navigate back
//        transaction.commit();
//    }

    @Override
    public void onInfoWindowClick(Marker marker) {
        // Handle info window click if needed
    }

    // Check for location permission at runtime using requestPermissionLauncher
    private void checkLocationPermission() {
        String[] permissions = {Manifest.permission.ACCESS_FINE_LOCATION};
        requestPermissionLauncher.launch(permissions);
    }
}
