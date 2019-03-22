package com.example.quiz_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;

public class DatabaseHelper extends SQLiteOpenHelper {


    public static final String DATABASE_NAME = "BestFriendQuizDB";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase database = this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE IF NOT EXISTS Name(nameId INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "yourName VARCHAR, friendName VARCHAR)");

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS Name;");
        //onCreate(db);

    }

    public void insertData(String strYourName,String strFriendName){

        ContentValues contentValues = new ContentValues();
        contentValues.put("yourName",strYourName);
        contentValues.put("friendName",strFriendName);
        this.getWritableDatabase().insert("Name","",contentValues);

    }

    public void update_name(String stryourName, String strFriendName){
        this.getWritableDatabase().execSQL("UPDATE Name SET yourName='"+stryourName+"'," +
                                            "friendName='"+strFriendName+"'WHERE nameId=1");

    }

    public void showFriendName(TextView textView){

        Cursor cursor = this.getReadableDatabase().rawQuery("SELECT * FROM Name",null);
        textView.setText("");
        while (cursor.moveToNext()){

            //Shows yourname and friend name
            //  textView.append(cursor.getString(1)+cursor.getString(2)+"\n");
            //1 is first column meaning your name
            // 2 is second column meaning friend name

            textView.append(cursor.getString(2));

            break;
        }

    }

    public void showQuestion(TextView textShowQuestion){

        Cursor cursor = this.getReadableDatabase().rawQuery("SELECT * FROM Question",null);
        textShowQuestion.setText("");

            while (cursor.moveToNext()){


                textShowQuestion.append(cursor.getString(1));

                break;
            }


    }


}
