package com.example.aspire;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.ArrayList;
import java.util.Arrays;

public class PdfViewer extends AppCompatActivity {
    //ArrayList<String> phyChapters11 = new ArrayList<>(Arrays.asList())

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        ArrayList<String> load = intent.getStringArrayListExtra("position");
        PDFView pdfView = findViewById(R.id.pdfDisplay);
        if(load.get(0).equals("0") && load.get(1).equals("phy")) pdfView.fromAsset("Class_11_Chapter "+load.get(2)+".pdf").load();
        else if(load.get(0).equals("1") && load.get(1).equals("phy")) pdfView.fromAsset("Class_12_Chapter "+load.get(2)+".pdf").load();
        else if(load.get(0).equals("0") && load.get(1).equals("chem")) pdfView.fromAsset("chem11_"+load.get(2)+".pdf").load();
        else if(load.get(0).equals("1") && load.get(1).equals("chem")) pdfView.fromAsset("12-Chemistry-Ncert-Chapter-"+load.get(2)+".pdf").load();
        else if(load.get(0).equals("0") && load.get(1).equals("math")) pdfView.fromAsset("11_math_"+load.get(2)+".pdf").load();
        else if(load.get(0).equals("1") && load.get(1).equals("math")) pdfView.fromAsset("12_math_"+load.get(2)+".pdf").load();
    }
}
