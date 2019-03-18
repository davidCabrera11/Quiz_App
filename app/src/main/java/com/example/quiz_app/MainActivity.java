package com.example.quiz_app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        EditText yourName = (EditText) findViewById(R.id.yourName);
        EditText friendName = (EditText) findViewById(R.id.friendName);

        yourName.setHintTextColor(Color.GRAY);
        friendName.setHintTextColor(Color.GRAY);



    }
}
