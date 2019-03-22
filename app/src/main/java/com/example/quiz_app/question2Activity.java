package com.example.quiz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class question2Activity extends AppCompatActivity {


    public String[] strQuestions={
            "How often do you see 5 ?" , // 0
            "Do you trust 5 ?" , // 1
            "How often do you fight with 5?", //2
            "How much do you have in common with 5?", //3
            "How much do you know about 5?", //4
            "Do you enjoy being with 5 ?", //5
            "Does 5 annoy you a lot ?", //6
            "Do you trust 5 with your secrets ?", //7
            "Do you talk with 5 every day ?", //8
            "Does 5 help you ?"}; //9


    TextView question, choice1, choice2, choice3, numberOfQuestion;

    private questionsChoices mQuestions = new questionsChoices();

    private String strAnswer10, strAnswer6, strAnswer3;
    private int iScore = 0, iquestionNumber = 1;
    private int iQuestionLength = strQuestions.length;

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
        numberOfQuestion.setText(iquestionNumber+"/10");


        updateQuesiton(r.nextInt(iQuestionLength));

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (choice1.getText() == strAnswer10){
                    iScore= iScore+10;
                    iquestionNumber++;
                    numberOfQuestion.setText(iquestionNumber+"/10");
                    updateQuesiton(r.nextInt(iQuestionLength));

                    if(iquestionNumber >=11){

                        numberOfQuestion.setText("10/10");
                        Intent intent = new Intent(question2Activity.this,ResultsActivity.class);
                        intent.putExtra("Score",iScore);
                        startActivity(intent);
                        finish();
                    }
                }else if (choice1.getText() == strAnswer6){
                    iScore=iScore+6;
                    iquestionNumber++;
                    numberOfQuestion.setText(iquestionNumber+"/10");
                    updateQuesiton(r.nextInt(iQuestionLength));

                    if(iquestionNumber >=11){

                        numberOfQuestion.setText("10/10");
                        Intent intent = new Intent(question2Activity.this,ResultsActivity.class);
                        intent.putExtra("Score",iScore);
                        startActivity(intent);
                        finish();
                    }
                }else if (choice1.getText() == strAnswer3){
                    iScore=iScore+3;
                    iquestionNumber++;
                    numberOfQuestion.setText(iquestionNumber+"/10");
                    updateQuesiton(r.nextInt(iQuestionLength));

                    if(iquestionNumber >=11){

                        numberOfQuestion.setText("10/10");
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
                if (choice2.getText() == strAnswer10){
                    iScore= iScore +10;
                    iquestionNumber++;
                    numberOfQuestion.setText(iquestionNumber+"/10");
                    updateQuesiton(r.nextInt(iQuestionLength));

                    if(iquestionNumber >= 11){

                        numberOfQuestion.setText("10/10");
                        Intent intent = new Intent(question2Activity.this,ResultsActivity.class);
                        intent.putExtra("Score",iScore);
                        startActivity(intent);
                        finish();
                    }
                }else if (choice2.getText() == strAnswer6){
                    iScore=iScore+6;
                    iquestionNumber++;
                    numberOfQuestion.setText(iquestionNumber+"/10");
                    updateQuesiton(r.nextInt(iQuestionLength));

                    if(iquestionNumber >=11){

                        numberOfQuestion.setText("10/10");
                        Intent intent = new Intent(question2Activity.this,ResultsActivity.class);
                        intent.putExtra("Score",iScore);
                        startActivity(intent);
                        finish();
                    }
                } else if (choice2.getText() == strAnswer3){
                    iScore=iScore+3;
                    iquestionNumber++;
                    numberOfQuestion.setText(iquestionNumber+"/10");
                    updateQuesiton(r.nextInt(iQuestionLength));

                    if(iquestionNumber >=11){

                        numberOfQuestion.setText("10/10");
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

                if (choice3.getText() == strAnswer10){
                    iScore= iScore+10;
                    iquestionNumber++;
                    numberOfQuestion.setText(iquestionNumber+"/10");
                    updateQuesiton(r.nextInt(iQuestionLength));

                    if(iquestionNumber >= 11){
                        numberOfQuestion.setText("10/10");
                        Intent intent = new Intent(question2Activity.this,ResultsActivity.class);
                        intent.putExtra("Score",iScore);
                        startActivity(intent);
                        finish();
                    }
                }else if (choice3.getText() == strAnswer6){
                    iScore=iScore+6;
                    iquestionNumber++;
                    numberOfQuestion.setText(iquestionNumber+"/10");
                    updateQuesiton(r.nextInt(iQuestionLength));

                    if(iquestionNumber >=11){

                        numberOfQuestion.setText("10/10");
                        Intent intent = new Intent(question2Activity.this,ResultsActivity.class);
                        intent.putExtra("Score",iScore);
                        startActivity(intent);
                        finish();
                    }
                }else if (choice3.getText() == strAnswer3){
                    iScore=iScore+3;
                    iquestionNumber++;
                    numberOfQuestion.setText(iquestionNumber+"/10");
                    updateQuesiton(r.nextInt(iQuestionLength));

                    if(iquestionNumber >=11){

                        numberOfQuestion.setText("10/10");
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

         //changes the 5 place holder in the questions to the friends name
        for (int index = 0; index<strQuestions.length;index++){

            strQuestions[index] = strQuestions[index].replace("5",strFriend);
        }

        question.setText(strQuestions[inumber]);
        choice1.setText(mQuestions.getChoice1(inumber));
        choice2.setText(mQuestions.getChoice2(inumber));
        choice3.setText(mQuestions.getChoice3(inumber));

        strAnswer10 = mQuestions.strGetCorrectAnswer10points(inumber);
        strAnswer6 = mQuestions.strGetCorrectAnswer6points(inumber);
        strAnswer3 = mQuestions.strGetCorrectAnswer3points(inumber);

     }



}
