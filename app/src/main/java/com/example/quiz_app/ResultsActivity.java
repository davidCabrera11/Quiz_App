package com.example.quiz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class ResultsActivity extends AppCompatActivity {


    TextView showResult;
    private Button btnResartQuiz;
    private  int a = 0;

    private AdView adView;
    private InterstitialAd interstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        //Admob
        MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713");
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        AdRequest adRequest = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest);


        btnResartQuiz = findViewById(R.id.restartQuizButton);
        btnResartQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                displayAds(btnResartQuiz);

                if (a==1){
                    Intent intent = new Intent(ResultsActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();

                }

                a++;

            }
        });




        int result = getIntent().getExtras().getInt("Score");

        String strResult = Integer.toString(result);

        showResult=findViewById(R.id.textShowResults);

        showResult.setText(strResult+"%");



    }

    public void displayAds(View view) {

        interstitialAd.show();

    }
}
