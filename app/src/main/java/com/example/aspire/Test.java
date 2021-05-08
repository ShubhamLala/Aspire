package com.example.aspire;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.animation.Animator;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Test extends AppCompatActivity {

    TextView first,second,third,simpleText,instruction,timer,selected = null;
    CountDownTimer countDownTimer = null;
    Button begin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        begin = findViewById(R.id.beginTest);
        begin.setAlpha(0);
        timer = findViewById(R.id.timer);
        instruction = findViewById(R.id.instruction);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        simpleText = findViewById(R.id.simpleText);
        first.setY(1000);
        second.setY(1000);
        third.setY(1000);
        first.animate().translationYBy(-1000).setDuration(500).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                second.animate().translationYBy(-1000).setDuration(500).setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        third.animate().translationYBy(-1000).setDuration(500).setListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {
                                begin.animate().alpha(1).setDuration(500);
                            }

                            @Override
                            public void onAnimationCancel(Animator animation) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {

                            }
                        });
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }

    public void animate(TextView textView){
        int cx = textView.getMeasuredWidth()/2;
        int cy = textView.getMeasuredHeight()/2;
        int finalRadius = Math.max(textView.getWidth(),textView.getHeight())/2;
        Animator animator = ViewAnimationUtils.createCircularReveal(textView,cx,cy,0,finalRadius);
        animator.setInterpolator(new AccelerateDecelerateInterpolator());
        animator.setDuration(500);
        animator.start();
    }

    public void clickText(View view){
        TextView clickedTextView = (TextView) view;
        selected = clickedTextView;
        switch (clickedTextView.getId()){
            case R.id.first:
                changeColor(first,second,third);
                break;
            case R.id.second:
                changeColor(second,first,third);
                break;
            case R.id.third:
                changeColor(third,first,second);
                break;
        }
        animate(clickedTextView);
    }
    public void changeColor(TextView t1,TextView t2,TextView t3){
        t1.setTextColor(Color.parseColor("#ff0000"));
        t2.setTextColor(Color.BLACK);
        t3.setTextColor(Color.BLACK);
    }

    public void beginTest(View view){
        if(selected == null) Toast.makeText(this, "Please Select A Year", Toast.LENGTH_LONG).show();
        else{
            disappear(simpleText);
            disappear(first);
            disappear(second);
            disappear(third);
            begin.animate().alpha(0).setDuration(500).setListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animation) {

                }

                @Override
                public void onAnimationEnd(Animator animation) {
                    instruction.setVisibility(View.VISIBLE);
                    timer.setVisibility(View.VISIBLE);
                    instruction.setY(-1000);
                    timer.setY(1000);
                    instruction.animate().translationYBy(1000).setDuration(500);
                    timer.animate().translationYBy(-1000).setDuration(500).setListener(new Animator.AnimatorListener() {
                        @Override
                        public void onAnimationStart(Animator animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animator animation) {
                            countDownTimer = new CountDownTimer(5000, 1000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                    timer.setText("Test Begins in: "+Integer.toString((int)millisUntilFinished/1000));
                                }

                                @Override
                                public void onFinish() {
                                    Intent intent = new Intent(getApplicationContext(),GivingTest.class);
                                    intent.putExtra("year",selected.getText().toString());
                                    startActivity(intent);
                                }
                            }.start();
                        }

                        @Override
                        public void onAnimationCancel(Animator animation) {

                        }

                        @Override
                        public void onAnimationRepeat(Animator animation) {

                        }
                    });
                }

                @Override
                public void onAnimationCancel(Animator animation) {

                }

                @Override
                public void onAnimationRepeat(Animator animation) {

                }
            });
        }
    }
    public void disappear(final View view){
        view.animate().alpha(0).setDuration(500).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                view.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        if(countDownTimer == null) super.onBackPressed();
        else Toast.makeText(this, "Cannot Go Back At This Stage", Toast.LENGTH_LONG).show();
    }
}
