package com.example.cardgamequiz;

public class QuizLibrary {

    String[] questions = {
            "What color is the average person eyes?",
            "What time does the first class start at MSU?",
            "How many days are in December?",
            "How many days are in February on average?",
            "How many eyes do humans have?"
    };

    String[] correctAnswers = {
            "Brown",
            "8:30am",
            "31",
            "28",
            "2"
    };

    String[][] possibleChoices = {
            {"Yellow", "Brown", "Blue", "Red"},
            {"7:00am", "8:00am", "8:30am", "11:30am"},
            {"31", "29", "30", "28"},
            {"26", "27", "28", "29"},
            {"1", "3", "4", "2"}
    };

    // int a symbolizes the current question that we are on
    String getQuestion(int a) {
        String question = questions[a];
        return  question;
    }
    String getChoice1(int a) {
        String choice1 = possibleChoices[a][0];
        return choice1;
    }
    String getChoice2(int a) {
        String choice2 = possibleChoices[a][1];
        return choice2;
    }
    String getChoice3(int a) {
        String choice3 = possibleChoices[a][2];
        return choice3;
    }
    String getChoice4(int a) {
        String choice4 = possibleChoices[a][3];
        return choice4;
    }

    String getCorrectAnswer(int a) {
        String correctAnswer = correctAnswers[a];
        return  correctAnswer;
    }
}
