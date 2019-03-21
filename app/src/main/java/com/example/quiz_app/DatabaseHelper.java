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

        db.execSQL("CREATE TABLE IF NOT EXISTS Name(nameId INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "yourName VARCHAR, friendName VARCHAR)");




    }

    public void insertQuestions(String strq1, String strq2, String strq3, String strq4, String strq5,String strq6, String strq7, String strq8, String strq9){


        ContentValues contentValues = new ContentValues();
        contentValues.put("question",strq1);
        //contentValues.put("question",strq2);
        //contentValues.put("question",strq3);
        //contentValues.put("question",strq4);
        //contentValues.put("question",strq5);
        //contentValues.put("question",strq6);
        //contentValues.put("question",strq7);
        //contentValues.put("question",strq8);
        //contentValues.put("question",strq9);
        //contentValues.put("question",strq10);
        this.getWritableDatabase().insert("Question","",contentValues);


     }


    public void insertChoice(){



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
