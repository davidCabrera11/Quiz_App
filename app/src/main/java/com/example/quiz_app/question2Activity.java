package com.example.quiz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class question2Activity extends AppCompatActivity {

    TextView question, choice1, choice2, choice3, numberOfQuestion;

    private questionsChoices mQuestions = new questionsChoices();

    private String strAnswer;
    private int iScore = 0, iquestionNumber = 0;
    private int iQuestionLength = mQuestions.strQuestions.length;

    Random r;

    



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        r = new Random();

        question = findViewById(R.id.textViewQuestion);
        choice1 = findViewById(R.id.textChoice1);
        choice2 = findViewById(R.id.textChoice2);
        choice3 = findViewById(R.id.textChoice3);
        numberOfQuestion = findViewById(R.id.textNumberQuestion);

        numberOfQuestion.setText("Score: "+ iScore);


        updateQuesiton(r.nextInt(iQuestionLength));

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (choice1.getText() == strAnswer){
                    iScore++;
                    iquestionNumber++;
                    numberOfQuestion.setText("Score: "+ iScore);
                    updateQuesiton(r.nextInt(iQuestionLength));

                    if(iScore >=11){

                        Intent intent = new Intent(question2Activity.this,ResultsActivity.class);
                        intent.putExtra("Score",iScore);
                        startActivity(intent);
                        finish();
                    }
                }

            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choice2.getText() == strAnswer){
                    iScore++;
                    iquestionNumber++;
                    numberOfQuestion.setText("Score: "+ iScore);
                    updateQuesiton(r.nextInt(iQuestionLength));

                    if(iScore >= 11){

                        Intent intent = new Intent(question2Activity.this,ResultsActivity.class);
                        intent.putExtra("Score",iScore);
                        startActivity(intent);
                        finish();
                    }
                }


            }
        });

        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (choice3.getText() == strAnswer){
                    iScore++;
                    iquestionNumber++;
                    numberOfQuestion.setText("Score: "+ iScore);
                    updateQuesiton(r.nextInt(iQuestionLength));

                    if(iScore >= 11){

                        Intent intent = new Intent(question2Activity.this,ResultsActivity.class);
                        intent.putExtra("Score",iScore);
                        startActivity(intent);
                        finish();
                    }
                }


            }
        });


    }

     private void  updateQuesiton(int inumber){

        String strFriend = getIntent().getExtras().getString("friend");



        question.setText(mQuestions.strGetQuestion(inumber));
        choice1.setText(mQuestions.getChoice1(inumber));
        choice2.setText(mQuestions.getChoice2(inumber));
        choice3.setText(mQuestions.getChoice3(inumber));

        strAnswer = mQuestions.strGetCorrectAnswer(inumber);

     }

     private void changeToName(){


     }

}
