package com.example.android.krakowtourguide;

public class Location {

    //Declaring class variables
    private int Name;
    private int ImageResourceId;
    private int Location;

    //Creating the object constructor
    public Location(int name, int imageResourceId, int location) {
        this.ImageResourceId = imageResourceId;
        this.Location = location;
        this.Name = name;
    }

    //Getter for the location name
    public int getName() {
        return Name;
    }

    //Getter for the location image
    public int getImageResourceId() {
        return ImageResourceId;
    }

    //Getter for the address
    public int getLocation() {
        return Location;
    }
}