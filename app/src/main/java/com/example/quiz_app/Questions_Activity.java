package com.example.quiz_app;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Questions_Activity extends AppCompatActivity {

    DatabaseHelper bffDatabase;
    TextView textViewQuestion;
    TextView textNumberQuestion, textChoice1;
    int questionNumber = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_);

        textViewQuestion = findViewById(R.id.textViewQuestion);
       // textChoice1 = findViewById(R.id.textChoice1);
        textNumberQuestion = findViewById(R.id.textNumberQuestion);


        bffDatabase = new DatabaseHelper(this);
        bffDatabase.showQuestion(textViewQuestion);



    }

    //Increases the question number at the bottom text view on activity questions xml
    public  void questionIncrease(View view){

        int maxNumbQuestion =10;

        questionNumber++;
        String numberTest = String.valueOf(questionNumber);

        if(questionNumber <= maxNumbQuestion){


            textNumberQuestion.setText(numberTest+"/10");


        }

       // numberTest = String.valueOf(a);
        //textNumber.setText(numberTest);



    }




}
