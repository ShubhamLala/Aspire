package com.example.aspire;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GivingTest extends AppCompatActivity implements GivingTestFragment.OndataPass {
    boolean phy=false,chem=false,maths=false;
    CountDownTimer countDownTimer;
    String year;
    HashMap<Integer,Integer> phyOptions = new HashMap<>();
    HashMap<Integer,Integer> chemOptions = new HashMap<>();
    HashMap<Integer,Integer> mathOptions = new HashMap<>();
    ArrayList<Integer> answers2013;
    ArrayList<Integer> answers2014;
    ArrayList<Integer> answers2015;

    int phyMarks=0,chemMarks=0,mathMarks=0,totalMarks=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giving_test);
        Intent intent = getIntent();
        year = intent.getStringExtra("year");
        initializingPapers();
        Toolbar toolbar = findViewById(R.id.givingTestToolBar);
        setSupportActionBar(toolbar);
        final TextView remainingTime = findViewById(R.id.remainingTime);
        countDownTimer = new CountDownTimer(10800000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                remainingTime.setText("Time Remaining: "+Integer.toString(((int)millisUntilFinished/1000)/60)+" min "+Integer.toString(((int)millisUntilFinished/1000)%60)+" sec");
            }

            @Override
            public void onFinish() {

            }
        }.start();
        ViewPager viewPager = findViewById(R.id.givingTestViewPager);
        viewPager.setAdapter(new GivingTestViewPagerAdapter(getSupportFragmentManager(),year));
        viewPager.setOffscreenPageLimit(2);
        TabLayout tabLayout = findViewById(R.id.givingTestTab);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Cannot Go Back", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDataPass(int pos, HashMap<Integer, Integer> options) {
        switch (pos){
            case 0:
                phy = true;
                phyOptions = options;
                break;
            case 1:
                chem = true;
                chemOptions = options;
                break;
            case 2:
                maths = true;
                mathOptions = options;
                break;
        }
        if(phy && chem && maths){
            Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show();
            countDownTimer.cancel();
            switch (year){
                case "2013":
                    calculateMarks(answers2013,phyOptions,chemOptions,mathOptions);
                    break;
                case "2014":
                    calculateMarks(answers2014,phyOptions,chemOptions,mathOptions);
                    break;
                case "2015":
                    calculateMarks(answers2015,phyOptions,chemOptions,mathOptions);
                    break;
            }
            Intent intent = new Intent(this,ShowResults.class);
            ArrayList<String> marks = new ArrayList<>(Arrays.asList(Integer.toString(phyMarks),Integer.toString(chemMarks),Integer.toString(mathMarks),Integer.toString(totalMarks)));
            intent.putStringArrayListExtra("marks",marks);
            startActivity(intent);
        }
        else Toast.makeText(this, "Submit Other Papers", Toast.LENGTH_LONG).show();
    }
    public void calculateMarks(ArrayList<Integer> answers,HashMap<Integer,Integer> phyOp,HashMap<Integer,Integer> chemOp,HashMap<Integer,Integer> mathOp){
        for(int i = 0;i<30;i++){
            if(phyOp.get(i+1) !=null){
                if(answers.get(i).equals(phyOp.get(i+1))) phyMarks+=4;
                else phyMarks-=1;
            }
        }
        for(int i = 30;i<60;i++){
            if(chemOp.get(i-30+1) !=null){
                if(answers.get(i).equals(chemOp.get(i-30+1))) chemMarks+=4;
                else chemMarks-=1;
            }
        }
        for(int i = 60;i<90;i++){
            if(mathOp.get(i-60+1) !=null){
                if(answers.get(i).equals(mathOp.get(i-60+1))) mathMarks+=4;
                else mathMarks-=1;
            }
        }
        totalMarks = phyMarks + chemMarks + mathMarks;
    }

    public void initializingPapers() {
        answers2014 = new ArrayList<>(Arrays.asList(1,3,2,1,3,3,4,1,3,1,3,4,1,4,3,3,1,3,2,3,3,3,2,2,4,2,3,1,4,2,1,2,3,2,1,9,3,1,2,4,3,2,2,1,4,2,2,1,4,2,2,4,4,3,1,1,4,1,1,3,2,4,3,2,1,4,2,1,2,2,2,2,1,4,2,3,3,4,1,1,2,3,3,3,2,1,4,2,2,3));
        answers2015= new ArrayList<>(Arrays.asList(3,2,3,3,2,3,2,1,3,9,3,2,2,1,9,2,4,3,4,2,3,4,2,1,4,2,1,3,3,1,4,1,3,4,4,2,2,2,1,1,3,4,1,2,4,2,4,2,3,1,1,1,2,4,4,3,2,1,3,1,1,3,3,4,3,2,1,2,2,3,1,4,3,4,3,4,3,4,3,3,4,4,4,3,1,1,4,1,1,4));
        answers2013 = new ArrayList<>(Arrays.asList(1,2,4,4,3,1,4,3,3,3,4,3,1,1,3,3,1,1,4,1,4,4,1,2,1,2,4,3,2,4,4,3,2,3,1,4,2,3,1,4,2,4,1,1,1,4,2,4,4,1,2,3,3,1,3,1,2,3,2,2,2,4,2,4,2,3,3,3,1,4,3,3,3,2,3,1,2,4,1,3,4,4,4,4,4,2,1,4,4,2));
    }


}
