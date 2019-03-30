package com.example.cardgamequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class QuizRules extends AppCompatActivity {

    Button startQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_rules);

        startQuiz = findViewById(R.id.start_quiz);
        startActivity(new Intent(QuizRules.this, MainActivity.class));
    }
}
