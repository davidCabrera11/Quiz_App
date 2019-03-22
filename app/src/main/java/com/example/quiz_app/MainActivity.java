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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {


    private Button btnStartQuiz;
    private EditText editTextYourName;
    private EditText editTextFriendName;
    public String passFriendName;

    private AdView adView;

    DatabaseHelper bffDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bffDatabase = new DatabaseHelper(this);

        btnStartQuiz = findViewById(R.id.startQuizButton);
        editTextYourName = findViewById(R.id.yourName);
        editTextFriendName = findViewById(R.id.friendName);


        //Admob
        MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713");
        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);



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

                        passFriendName = editTextFriendName.getText().toString();

                        Intent intent = new Intent(MainActivity.this,question2Activity.class);
                        intent.putExtra("friend",passFriendName);
                        startActivity(intent);
                        finish();
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
