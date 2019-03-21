package com.example.quiz_app;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btnStartQuiz;
    private EditText editTextYourName;
    private EditText editTextFriendName;


    // 5 is used as a place holder to then replace it with the friends name
    public static final String strquestion1 = "How long have you known 5 ?";
    public static final String strquestion2 = "How often do you see 5 ?";
    public static final String strquestion3 = "Do you trust 5 ?";
    public static final String strquestion4 = "How often do you fight with 5?";
    public static final String strquestion5 = "How much do you have in common with 5?";
    public static final String strquestion6 = "How much do you know about 5?";
    public static final String strquestion7 = "Do you enjoy being with 5 ?";
    public static final String strquestion8 = "Does 5 annoy you a lot ?";
    public static final String strquestion9 = "Do you trust 5 with your secrets ?";
    public static final String strquestion10 = "Do you talk with 6 every day ?";

    DatabaseHelper bffDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bffDatabase = new DatabaseHelper(this);

        btnStartQuiz = findViewById(R.id.startQuizButton);
        editTextYourName = findViewById(R.id.yourName);
        editTextFriendName = findViewById(R.id.friendName);

        bffDatabase.insertQuestions(strquestion1,   strquestion2,   strquestion3,   strquestion4,   strquestion5,   strquestion6,
                strquestion7,   strquestion8,   strquestion9);

        //Move to Questions_Activity.java when button is pressed
        btnStartQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Checks if edit text is empty
                if(editTextYourName.length()==0){

                    editTextYourName.setError("Enter your name");


                }else if (editTextFriendName.length()==0){

                    editTextFriendName.setError("Enter friend's name");

                }else{

                        bffDatabase.insertData(editTextYourName.getText().toString(),editTextFriendName.getText().toString());
                        bffDatabase.update_name(editTextYourName.getText().toString(),editTextFriendName.getText().toString());


                    //Toast.makeText(MainActivity.this,"Names Inserted",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this,Questions_Activity.class);
                        startActivity(intent);
                }
            }
        });


        //Get edit text id
        EditText yourName = (EditText) findViewById(R.id.yourName);
        EditText friendName = (EditText) findViewById(R.id.friendName);

        //change the hint text color to gray
        yourName.setHintTextColor(Color.GRAY);
        friendName.setHintTextColor(Color.GRAY);

    }




}
