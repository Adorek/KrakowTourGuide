package com.example.android.krakowtourguide;

import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    //Creating a category adapter for the tabs
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    //Populating the tabs
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MuseumsFragment();
        } else if (position == 1) {
            return new MoundsFragment();
        } else if (position == 2) {
            return new NatureFragment();
        } else {
            return new ParksFragment();
        }
    }

    //Default method that has to be implemented to know how many tabs the app should have
    @Override
    public int getCount() {
        return 4;
    }

    //Scrolling through tabs
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.museums);
        } else if (position == 1) {
            return mContext.getString(R.string.mounds);
        } else if (position == 2) {
            return mContext.getString(R.string.nature);
        } else {
            return mContext.getString(R.string.parks);
        }
    }
}