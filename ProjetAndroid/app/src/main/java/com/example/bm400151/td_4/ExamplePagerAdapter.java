package com.example.bm400151.td_4;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ExamplePagerAdapter extends FragmentStatePagerAdapter {
    Fragment f1, f2;

    public ExamplePagerAdapter(FragmentManager fm) {
        super(fm);

        f1 = new NumberPickerFragment();
        f2 = new TextFragment();
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;

        switch( i ) {
            case 0 :  {
                fragment = f1;
                break;
            }
            case 1 : {
                fragment = f2;
                break;
            }
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        String fragment = null;

        switch( position ) {
            case 0 :  {
                fragment = "Number";
                break;
            }
            case 1 : {
                fragment = "Text";
                break;
            }
        }

        return fragment;
    }
}