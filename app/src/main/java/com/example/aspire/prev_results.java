package com.example.aspire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TableLayout;

import java.util.List;

public class prev_results extends AppCompatActivity {
    DataBaseHelper db;
    TableLayout t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prev_results);
        db=new DataBaseHelper(this);

    }
}
