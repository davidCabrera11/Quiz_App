package com.example.quiz_app;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Questions_Activity extends AppCompatActivity {

    DatabaseHelper bffDatabase;
    TextView textViewQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_);

        textViewQuestion = findViewById(R.id.textViewQuestion);
        bffDatabase = new DatabaseHelper(this);

        bffDatabase.showQuestion(textViewQuestion);





    }
}
