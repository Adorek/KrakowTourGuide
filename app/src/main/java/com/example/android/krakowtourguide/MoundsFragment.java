package com.example.android.krakowtourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MoundsFragment extends android.support.v4.app.Fragment {

    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Inflating the Layout in order to populate with objects
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Creating an ArrayList with Location objects
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.kosciuszko_name, R.drawable.kosiuszko, R.string.kosciuszko_address));
        locations.add(new Location(R.string.pilsudski_name, R.drawable.pilsudski, R.string.pilsudski_address));
        locations.add(new Location(R.string.kraka_name, R.drawable.kraka, R.string.kraka_address));
        locations.add(new Location(R.string.wandy_name, R.drawable.wandy, R.string.wandy_address));

        //Creating a location adapter
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        //Assigning a listView to the location list layout
        ListView listView = (ListView) rootView.findViewById(R.id.location_list);

        //Setting an adapter onto the listView
        listView.setAdapter(adapter);

        return rootView;
    }
}