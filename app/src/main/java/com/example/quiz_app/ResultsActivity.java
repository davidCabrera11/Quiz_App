package com.example.quiz_app;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.Random;

public class ResultsActivity extends AppCompatActivity {


    TextView showResult;
    private Button btnResartQuiz;
    private  int a = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

         SharedPreferences shResult = getSharedPreferences("SaveScore", Context.MODE_PRIVATE);


        int result = shResult.getInt("score",-1);

        String strResult = Integer.toString(result);

        showResult=findViewById(R.id.textShowResults);

        showResult.setText(strResult+"%");



        btnResartQuiz = findViewById(R.id.restartQuizButton);
        btnResartQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Intent intent = new Intent(ResultsActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();



            }
        });







    }


}
