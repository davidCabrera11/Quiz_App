package com.example.quiz_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class question2Activity extends AppCompatActivity {

    TextView question, choice1, choice2, choice3, numberOfQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);


        question = findViewById(R.id.textViewQuestion);
        choice1 = findViewById(R.id.textChoice1);
        choice2 = findViewById(R.id.textChoice2);
        choice3 = findViewById(R.id.textChoice3);
        numberOfQuestion = findViewById(R.id.textNumberQuestion);


        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

    }

    //private

}
