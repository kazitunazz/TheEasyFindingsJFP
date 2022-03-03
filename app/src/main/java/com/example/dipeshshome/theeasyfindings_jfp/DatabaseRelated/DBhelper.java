package com.example.dipeshshome.theeasyfindings_jfp.DatabaseRelated;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DBhelper extends SQLiteOpenHelper {
    private static final String DB_Name="MyDatabase";
    private static final int  DB_VER=1;
    private static final String DB_Table="Task";
    private static final String DB_Column="TaskName";

    public DBhelper(Context context) {
        super(context, DB_Name, null, DB_VER);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query=String.format("CREATE TABLE %s (ID INTEGER PRIMARY KEY AUTOINCREMENT,%s TEXT NOT NULL);",DB_Table,DB_Column);
         db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String query= String.format("DROP TABLE IF EXISTS %s",DB_Table);
        db.execSQL(query);
        onCreate(db);
    }

    //INSERT DATA CODE//
    public  void insertNewTask(String task)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values =new ContentValues();
        values.put(DB_Column,task);
        db.insertWithOnConflict(DB_Table,null,values,SQLiteDatabase.CONFLICT_REPLACE);
        db.close();
    }
    //DELETE DATA CODE//
    public  void deleteTask(String task)
    {
        SQLiteDatabase db= this.getWritableDatabase();
        db.delete(DB_Table,DB_Column + "=?",new String[]{task});
        db.close();
    }

    //LIST WISE DATA SHOW CODE//
    public ArrayList<String>getTaskList()
    {
        ArrayList<String>taskList=new ArrayList<>();
        SQLiteDatabase db= this.getReadableDatabase();
        Cursor cursor = db.query(DB_Table,new String[]{DB_Column},null,null,null,null,null);
        while(cursor.moveToNext())
        {
            int index= cursor.getColumnIndex(DB_Column);
            taskList.add(cursor.getString(index));

        }

        cursor.close();
        db.close();
        return taskList;


    }



}
