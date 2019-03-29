package com.example.cardgamequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView scoreView, questionView;
    private Button choiceOne, choiceTwo, choiceThree, choiceFour;

    private QuizLibrary quizLibrary = new QuizLibrary();
    private String correctAnswer;
    private int currentQuestion = 0;
    private int score = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreView = findViewById(R.id.score);
        questionView = findViewById(R.id.question);
        choiceOne = findViewById(R.id.choice_one);
        choiceTwo = findViewById(R.id.choice_two);
        choiceThree = findViewById(R.id.choice_three);
        choiceFour = findViewById(R.id.choice_four);


        choiceOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choiceOne.getText() == correctAnswer) {
                    score++;
                    updateScore(score);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, R.string.correct, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, R.string.incorrect, Toast.LENGTH_LONG).show();
                    updateQuestion();
                }
            }
        });
    }

    private void updateQuestion() {

        questionView.setText(currentQuestion);
        choiceOne.setText(quizLibrary.getChoice1(currentQuestion));
        choiceTwo.setText(quizLibrary.getChoice2(currentQuestion));
        choiceThree.setText(quizLibrary.getChoice3(currentQuestion));
        choiceFour.setText(quizLibrary.getChoice4(currentQuestion));
        correctAnswer = quizLibrary.getCorrectAnswer(currentQuestion);
        currentQuestion++;
        System.out.println("Working");
    }

    private void updateScore(int score) {
        scoreView.setText(String.valueOf(score));
    }
}
