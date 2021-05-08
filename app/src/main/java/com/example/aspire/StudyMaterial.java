package com.example.aspire;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class StudyMaterial extends AppCompatActivity {
    String subject = null;
    ViewPager viewPager;
    TabLayout tabLayout;
    TextView currentTextView = null;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_material);
        Toolbar toolbar = findViewById(R.id.toolbar);
        currentTextView = findViewById(R.id.studyPhy);
        setSupportActionBar(toolbar);
        linearLayout = findViewById(R.id.studyLinear);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        viewPager = findViewById(R.id.studyViewPager);
        tabLayout = findViewById(R.id.studyTab);
        setViewPager(subject);
    }

    public void subChange(View view){
        currentTextView.setTextColor(Color.BLACK);
        linearLayout.setAlpha(0);
        linearLayout.animate().alpha(1).setDuration(1000);
        currentTextView = (TextView) view;
        currentTextView.setTextColor(Color.parseColor("#80ff00"));
        switch (currentTextView.getId()){
            case R.id.studyPhy:
                setViewPager("phy");
                subject = "phy";
                break;
            case R.id.studyChem:
                setViewPager("chem");
                subject = "chem";
                break;
            case R.id.studyMaths:
                setViewPager("math");
                subject = "math";
                break;
        }
    }
    public void setViewPager(String subj){
        if (subj == null) subj = "phy";
        animate(subj,viewPager);
        viewPager.setAdapter(new StudyMaterialViewPagerAdapter(getSupportFragmentManager(),subj));
        tabLayout.setupWithViewPager(viewPager);

    }
    public void animate(String sub,ViewPager viewPager1){
        if(sub.equals("phy")){
            viewPager1.setX(-1000);
            viewPager1.animate().translationXBy(1000).setDuration(500);
        }
        else if(sub.equals("chem")){
            viewPager1.setX(1000);
            viewPager1.animate().translationXBy(-1000).setDuration(500);
        }
        else if(sub.equals("math")){
            viewPager1.setAlpha(0);
            viewPager1.animate().alpha(1).setDuration(500);
        }
    }
}
