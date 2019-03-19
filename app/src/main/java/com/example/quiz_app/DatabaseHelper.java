package com.example.quiz_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;

public class DatabaseHelper extends SQLiteOpenHelper {


    public static final String DATABASE_NAME = "BestFriendQuizDB";

    public static final String TABLE_1 = "Question_Table";
    public static final String COL_1_T1 = "questionId";
    public static final String COL_2_T1 = " questionLiteral";

    public static final String TABLE_2 = "Choice_Table";
    public static final String COL_1_T2 = "choiceId";
    public static final String COL_2_T2 = "points";
    public static final String COL_3_T2 = "questionId";

    public static final String TABLE_3 = "Name_Table";
    public static final String COL_1_T3 = "yourName";
    public static final String COL_2_T3 = "friendName";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase database = this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS Question(questionId  " +
                "INTEGER PRIMARY KEY AUTOINCREMENT, question VARCHAR)");

        db.execSQL("CREATE TABLE IF NOT EXISTS Choice(choiceId INTEGER PRIMARY KEY AUTOINCREMENT, choicePoints int, " +
                "questionId int, FOREIGN KEY(questionId) REFERENCES Question(questionId))");

        db.execSQL("CREATE TABLE IF NOT EXISTS Name(yourName VARCHAR, friendName VARCHAR)");


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

    public void update_name(String oldFriendName, String newFriendName){
        this.getWritableDatabase().execSQL("UPDATE Name SET friendName='"+newFriendName+"'" +
                                            "WHERE friendName='"+oldFriendName+"'");

    }

    public void showName(TextView textView){

        Cursor cursor = this.getReadableDatabase().rawQuery("SELECT * FROM Name",null);
        textView.setText("");
        while (cursor.moveToNext()){

            textView.append(cursor.getString(1)+"\n");
        }

    }

}
