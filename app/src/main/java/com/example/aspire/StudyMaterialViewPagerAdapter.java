package com.example.aspire;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class StudyMaterialViewPagerAdapter extends FragmentStatePagerAdapter {
    String subject;
    public StudyMaterialViewPagerAdapter(@NonNull FragmentManager fm,String subject) {
        super(fm);
        this.subject = subject;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new StudyMaterialViewPagerFragment();
        Bundle bundle = new Bundle();
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(Integer.toString(position),subject));
        bundle.putStringArrayList("message",arrayList);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0) return "11th";
        else return "12th";
    }
}
