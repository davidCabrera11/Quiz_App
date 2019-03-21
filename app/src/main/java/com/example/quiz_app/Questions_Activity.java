package com.example.quiz_app;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Questions_Activity extends AppCompatActivity {

    DatabaseHelper bffDatabase;
    TextView textViewQuestion;
    TextView textNumberQuestion, textChoice1;
    EditText editTextFriendName;
    int questionNumber = 1;
    int oldNumber;
    String strFriend;


    public String[] strQuestions={"How long have you known 5 ?",
            "How often do you see 5 ?" ,
            "Do you trust 5 ?" ,
            "How often do you fight with 5?" ,
            "How much do you have in common with 5?" ,
            "How much do you know about 5?" ,
            "Do you enjoy being with 5 ?" ,
            "Does 5 annoy you a lot ?" ,
            "Do you trust 5 with your secrets ?" ,
            "Do you talk with 5 every day ?" ,
            "1",
            "2",
            "3",
            "4",};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_);

        editTextFriendName = findViewById(R.id.friendName);


        textViewQuestion = findViewById(R.id.textViewQuestion);
       // textChoice1 = findViewById(R.id.textChoice1);
        textNumberQuestion = findViewById(R.id.textNumberQuestion);


        bffDatabase = new DatabaseHelper(this);
        bffDatabase.showQuestion(textViewQuestion);

        strFriend = getIntent().getExtras().getString("friend");


        for(int index =0;index<strQuestions.length;index++){
            strQuestions[index] = strQuestions[index].replace("5",strFriend);
        }

    }

    //Increases the question number at the bottom text view on activity questions xml
    public  void questionTextChange(View view){


        questionChange(view);

        int maxNumbQuestion =10;
        //String numberTest = String.valueOf(questionNumber);

        if(questionNumber < maxNumbQuestion){

            questionNumber++;
            textNumberQuestion.setText(Integer.toString(questionNumber)+"/10");


        }else{

            Intent intent = new Intent(Questions_Activity.this,ResultsActivity.class);
            startActivity(intent);
        }


       // numberTest = String.valueOf(a);
        //textNumber.setText(numberTest);

    }


    public void questionChange(View view){


        int random = (int) (Math.random() * strQuestions.length);

        if(random == oldNumber){
            random = (int) (Math.random() * strQuestions.length);

        }

        textViewQuestion.setText(strQuestions[random]);
        oldNumber=random;

    }


}
