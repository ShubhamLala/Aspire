package com.example.aspire;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {
    SQLiteDatabase db;
    private static final int DATABASE_VERSION = 1;
    protected static final String DATABASE_NAME = "PreviousMarks";
    public DataBaseHelper(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE PreviousMarks " +
                "( Sl_No INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "Marks1 CHAR(10), " +
                "Marks2 CHAR(10), "+
                "Marks3 CHAR(10), "+
                "Marks4 CHAR(10))";

        db.execSQL(sql);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS PreviousMarks ";
        db.execSQL(sql);

        onCreate(db);
    }
    public Cursor getAll(){
        SQLiteDatabase db =this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from PreviousMarks",null);
        return res;
    }
}
