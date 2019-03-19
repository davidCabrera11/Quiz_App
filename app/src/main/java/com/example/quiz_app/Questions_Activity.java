package com.example.quiz_app;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Questions_Activity extends AppCompatActivity {

    DatabaseHelper bffDatabase;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_);

        textView = findViewById(R.id.textView);
        bffDatabase = new DatabaseHelper(this);

        bffDatabase.showName(textView);





    }
}
