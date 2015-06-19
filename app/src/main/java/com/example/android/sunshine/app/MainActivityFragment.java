package com.example.android.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
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

        List<String> weekForecast = new ArrayList<>(Arrays.asList(forecastArray));

        //Now that we have some dummy forecast data, create an ArrayAdapter.
        //The ArrayAdapter will take data from a source (like our dummy forecast) and
        //use it to populate the ListView its attached to.
        mForecastAdapter = new ArrayAdapter<>(
          //The current context (this fragment parent activity
          getActivity(),
          //ID of the list item layout
          R.layout.list_item_forecast,
          //ID of the textview to populate
          R.id.list_item_forecast_textview,
          //Forecast data
          weekForecast);

        //Get a reference to the ListView, and attach this adapter to it
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
