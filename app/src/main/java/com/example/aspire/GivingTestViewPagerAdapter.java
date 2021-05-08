package com.example.aspire;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class GivingTestViewPagerAdapter extends FragmentStatePagerAdapter {
    String year;
    public GivingTestViewPagerAdapter(@NonNull FragmentManager fm,String year) {
        super(fm);
        this.year = year;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new GivingTestFragment();
        Bundle bundle = new Bundle();
        ArrayList<String> send = new ArrayList<>(Arrays.asList(Integer.toString(position),year));
        bundle.putStringArrayList("message",send);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Physics";
            case 1:
                return "Chemistry";
            case 2:
                return "Maths";
            default:
                return null;
        }
    }
}
