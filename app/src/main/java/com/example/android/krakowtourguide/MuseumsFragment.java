package com.example.android.krakowtourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsFragment extends android.support.v4.app.Fragment {

    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        //Inflating the Layout in order to populate with objects
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Creating an ArrayList with Location objects
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.national_museum_name, R.drawable.national_museum, R.string.national_museum_address));
        locations.add(new Location(R.string.shindlers_museum_name, R.drawable.shindlers_museum, R.string.shindlers_museum_address));
        locations.add(new Location(R.string.cricoteka_museum_name, R.drawable.cricoteka_museum, R.string.cricoteka_museum_address));
        locations.add(new Location(R.string.historical_museum_name, R.drawable.historical_museum, R.string.historical_museum_address));

        //Creating a location adapter
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        //Assigning a listView to the location list layout
        ListView listView = (ListView) rootView.findViewById(R.id.location_list);

        //Setting an adapter onto the listView
        listView.setAdapter(adapter);

        return rootView;
    }
}