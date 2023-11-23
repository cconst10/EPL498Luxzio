/**
package com.example.epl498luxzio;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.epl498luxzio.databinding.FragmentHomePageBinding;

import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class APICallFragment extends Fragment {

    private CronetEngine.Builder myBuilder;
    private CronetEngine cronetEngine;
    private Executor executor;
    private TextView daysRemainingTxt;
    private ProgressBar progressBar;

    private FragmentHomePageBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentHomePageBinding.inflate(inflater, container, false);
        daysRemainingTxt = binding.weatherTxt; // Corrected reference
        progressBar = binding.progressBar;

        makeApiRequest();
        return binding.getRoot();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myBuilder = new CronetEngine.Builder(getContext());
        cronetEngine = myBuilder.build();
        executor = Executors.newSingleThreadExecutor();
    }

    private void makeApiRequest() {
        progressBar.setVisibility(View.VISIBLE);
        daysRemainingTxt.setVisibility(View.GONE);

        // Set the country code for Cyprus
        String selectedCountryCode = "US";

        // Set the API endpoint based on the selected country code
        String apiUrl = "https://public-holiday.p.rapidapi.com/2023/" + selectedCountryCode;

        UrlRequest.Builder requestBuilder = cronetEngine.newUrlRequestBuilder(
                apiUrl,
                new EPL498RequestCallback(),
                executor);

        // Include the RapidAPI key in the request headers
        requestBuilder.addHeader("dcbf59796bmsh54f4a1390e95492p131fd5jsnb3bc88a4e352", "3e08ccc1efmsh4c1b35b1232937bp1a4139jsnfc64c6eaee71");

        UrlRequest request = requestBuilder.build();
        request.start();
    }


    private void updateDaysRemainingTextView(String holidaysData) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    JSONArray holidaysArray = new JSONArray(holidaysData);

                    // Find Christmas in the holidays array
                    for (int i = 0; i < holidaysArray.length(); i++) {
                        JSONObject holiday = holidaysArray.getJSONObject(i);
                        if (holiday.getString("name").equalsIgnoreCase("Christmas Day")) {
                            String dateStr = holiday.getString("date");
                            // Calculate days remaining for Christmas
                            int daysRemaining = calculateDaysRemaining(dateStr);
                            // Update the TextView with the days remaining
                            daysRemainingTxt.setText("Days Remaining for Christmas: " + daysRemaining);
                            break;
                        }
                    }

                    // Hide/show appropriate UI components
                    progressBar.setVisibility(View.GONE);
                    daysRemainingTxt.setVisibility(View.VISIBLE);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private int calculateDaysRemaining(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date christmasDate = sdf.parse(dateStr);
            Date currentDate = new Date();

            // Calculate days remaining
            long diff = christmasDate.getTime() - currentDate.getTime();
            return (int) (diff / (24 * 60 * 60 * 1000));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return -1;
    }

    class EPL498RequestCallback extends UrlRequest.Callback {
        private static final String TAG = "EPL498RequestCallback";

        @Override
        public void onResponseStarted(UrlRequest request, UrlResponseInfo info) {
            Log.i(TAG, "onResponseStarted method called.");
            request.read(ByteBuffer.allocateDirect(102400));
        }

        @Override
        public void onReadCompleted(UrlRequest request, UrlResponseInfo info, ByteBuffer byteBuffer) {
            Log.i(TAG, "onReadCompleted method called.");
            byteBuffer.flip();
            byte[] bytes = new byte[byteBuffer.remaining()];
            byteBuffer.get(bytes);
            String response = new String(bytes);

            Log.i("HolidayData", response);
            updateDaysRemainingTextView(response);

            byteBuffer.clear();
            request.read(byteBuffer);
        }

        @Override
        public void onSucceeded(UrlRequest request, UrlResponseInfo info) {
            Log.i(TAG, "onSucceeded method called.");
        }

        @Override
        public void onFailed(UrlRequest request, UrlResponseInfo info, CronetException error) {
            Log.i(TAG, "onFailed method called.");
        }

        @Override
        public void onRedirectReceived(UrlRequest request, UrlResponseInfo info, String newLocationUrl) throws Exception {
            // do nothing for now
        }
    }
}
*/