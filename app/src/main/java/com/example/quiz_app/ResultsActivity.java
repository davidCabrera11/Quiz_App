package com.example.quiz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {


    TextView showResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);


        int result = getIntent().getExtras().getInt("Score");

        String strResult = Integer.toString(result);


        showResult=findViewById(R.id.textShowResults);

        showResult.setText("Congratulations you scored "+strResult+"%");




    }
}
