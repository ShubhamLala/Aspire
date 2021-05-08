package com.example.aspire;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class ShowResults extends AppCompatActivity {
    DataBaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_results);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        ArrayList<String> marks = intent.getStringArrayListExtra("marks");
        TextView phyMarks = findViewById(R.id.physicsMarks);
        TextView chemMarks = findViewById(R.id.chemistryMarks);
        TextView mathMarks = findViewById(R.id.mathsMarks);
        TextView totalMarks = findViewById(R.id.totalMarks);
        phyMarks.setText("Physics Marks: "+marks.get(0));
        chemMarks.setText("Chemistry Marks: "+marks.get(1));
        mathMarks.setText("Maths Marks: "+marks.get(2));
        totalMarks.setText("Total Marks: "+marks.get(3));
        ObjectEvent obj=new ObjectEvent();
        obj.marks1=marks.get(0);obj.marks2=marks.get(1);obj.marks3=marks.get(2);obj.marks4=marks.get(3);
        boolean createSuccessful=new TableControllerEvent(this).create(obj);
        if(createSuccessful){
        Toast.makeText(this, "Marks Saved", Toast.LENGTH_SHORT).show();}
        else {
            Toast.makeText(this, "Marks Not Saved", Toast.LENGTH_SHORT).show();
        }
        animate(phyMarks); animate(chemMarks); animate(mathMarks); animate(totalMarks);
        
        Button button=findViewById(R.id.buttonp);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                //startActivity(new Intent(ShowResults.this,prev_results.class));
                Cursor res=myDb.getAll();
                if(res.getCount()!=0){
                    StringBuffer buffer=new StringBuffer();
                    while(res.moveToNext()){
                        buffer.append("Sl no:"+res.getString(0)+" Physics:"+res.getString(1)+" Chemistry:"+res.getString(2)+" Maths:"+res.getString(3)+"\nTotal:"+res.getString(4));

                    }
                }
            }
        });
    }
    public void animate(TextView textView){
        textView.setX(1000);
        textView.animate().translationXBy(-1000).setDuration(1000);
        textView.setVisibility(View.VISIBLE);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this,MainActivity.class));
    }
}

