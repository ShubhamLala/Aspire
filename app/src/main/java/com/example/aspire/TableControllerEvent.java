package com.example.aspire;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class TableControllerEvent extends DataBaseHelper {

    public boolean create(ObjectEvent objectEvent) {

        ContentValues values = new ContentValues();

        values.put("marks1", objectEvent.marks1);
        values.put("marks2", objectEvent.marks2);
        values.put("marks3", objectEvent.marks3);
        values.put("marks4", objectEvent.marks4);

        SQLiteDatabase db = this.getWritableDatabase();

        boolean createSuccessful = db.insert("PreviousMarks", null, values) > 0;
        db.close();

        return createSuccessful;
    }
    public List<ObjectEvent> read() {

        List<ObjectEvent> recordsList = new ArrayList<ObjectEvent>();

        String sql = "SELECT * FROM PreviousMarks ORDER BY id DESC";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {

                int id = Integer.parseInt(cursor.getString(cursor.getColumnIndex("id")));
                String marks1= cursor.getString(cursor.getColumnIndex("marks1"));
                String marks2 = cursor.getString(cursor.getColumnIndex("marks2"));
                String marks3 = cursor.getString(cursor.getColumnIndex("marks3"));
                String marks4 = cursor.getString(cursor.getColumnIndex("marks4"));

                ObjectEvent objectEvent = new ObjectEvent();
                objectEvent.q = id;
                objectEvent.marks1 = marks1;
                objectEvent.marks2 = marks2;
                objectEvent.marks3 = marks3;
                objectEvent.marks4 = marks4;


                recordsList.add(objectEvent);

            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return recordsList;
    }

    public TableControllerEvent(Context context) {
        super(context);
    }

}
