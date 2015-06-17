package com.example.android.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Create some dummy data for the listView.  Represented as "day, weather, high/low"

        String[] forecastArray = {
            "Today - Sunny - 88/63",
            "Tommorrow - Foggy - 70/40",
            "Weds - Cloudy - 72/63",
            "Thurs - Astroids - 75/65",
            "Fri - Heavy Rain - 65/56",
            "Sat - HELP TRAPPED IN WEATHER STATION - 75/62",
            "Sun - Sunny - 80/68"
        };

        List<String> weekForecast = new ArrayList<String>(
            Arrays.asList(forecastArray));

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
