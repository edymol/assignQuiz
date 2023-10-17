package com.deved.quiz;

import java.util.Scanner;

public class AnswerChecker {
    public int checkAnswers(QuizQuestion[] questions) {
        int score = 0;
        int points = 0;
        int nQuestions = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Let's begin the quiz!");


        for (int i = 0; i < questions.length; i++) {
            QuizQuestion question = questions[i];

            System.out.println("Question " + (i + 1) + ": " + question.question());

            String[] options = question.options();
            for (int j = 0; j < options.length; j++) {
                System.out.println((char) ('A' + j) + ". " + options[j]);
            }

            System.out.print("Your answer (A, B, C, D or True or False): ");
            String userAnswer = input.next().toUpperCase();

            int correctAnswerIndex = question.correctAnswerIndex();
            String correctAnswer = options[correctAnswerIndex];

            if (userAnswer.equals(String.valueOf((char) ('A' + correctAnswerIndex)))) {
                nQuestions++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is: " + correctAnswer);
            }
            if(question.difficulty().equals("easy")){
                score = points += 2;
            } else if (question.difficulty().equals("Medium")) {
                score = points += 3;

            } else {
                score = points += 5;
            }

        }

        System.out.println("Quiz complete!");
        System.out.println("You have " + nQuestions + " correct answers");
        System.out.println("Your score: " + score + " out of " + questions.length);

        return score;
    }
}
