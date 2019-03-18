package com.example.quiz_app;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private Button btnStartQuiz;
    private EditText editTextYourName;
    private EditText editTextFriendName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartQuiz = findViewById(R.id.startQuizButton);
        editTextYourName = findViewById(R.id.yourName);
        editTextFriendName = findViewById(R.id.friendName);


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
