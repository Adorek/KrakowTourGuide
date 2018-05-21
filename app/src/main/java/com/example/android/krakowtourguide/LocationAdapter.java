package com.example.android.krakowtourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    //Creating the View inflater
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Storing current location position
        Location currentLocation = getItem(position);

        //Assigning views to layouts
        ImageView imageView = listItemView.findViewById(R.id.image_view);
        imageView.setImageResource(currentLocation.getImageResourceId());

        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentLocation.getName());

        TextView addressTextView = listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentLocation.getLocation());

        return listItemView;
    }
}