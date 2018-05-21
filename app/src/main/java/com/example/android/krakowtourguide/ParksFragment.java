package com.example.android.krakowtourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends android.support.v4.app.Fragment {

    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        //Inflating the Layout in order to populate with objects
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Creating an ArrayList with Location objects
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.jordana_park_name, R.drawable.jordana, R.string.jordana_park_address));
        locations.add(new Location(R.string.bednarski_park_name, R.drawable.bednarski, R.string.bednarski_park_address));
        locations.add(new Location(R.string.krakowski_park_name, R.drawable.krakowski, R.string.krakowski_park_address));
        locations.add(new Location(R.string.planty_park_name, R.drawable.planty, R.string.planty_park_address));

        //Creating a location adapter
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        //Assigning a listView to the location list layout
        ListView listView = (ListView) rootView.findViewById(R.id.location_list);

        //Setting an adapter onto the listView
        listView.setAdapter(adapter);

        return rootView;
    }
}