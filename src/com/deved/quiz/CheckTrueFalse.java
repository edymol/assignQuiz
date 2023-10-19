package com.deved.quiz;

import java.util.Scanner;


public class CheckTrueFalse {
    public int checkTF(QuizQuestion[] trueFalse){
        int scoreTF = 0;
        int points = 0;
        int nQuestion = 0;
        int possiblePoints = 0;

        Scanner input = new Scanner(System.in);

        for(int i =0; i < trueFalse.length; i++){
            QuizQuestion trueFalseQ = trueFalse[i];
            System.out.println("Question " + (i + 1) + ": " + trueFalseQ.question());

            String [] options = trueFalseQ.options();
            for(int j = 0; j < options.length; j++){
                System.out.println((char) ('A' + j) + ". " + options[j]);
            }
            System.out.println("Your answer (True, False): ");
            String userAnswer = input.next().toUpperCase();

            int correctAnswerIndex = trueFalseQ.correctAnswerIndex();
            String correctAnswer = options[correctAnswerIndex];

            if (userAnswer.equals(String.valueOf((char) ('A' + correctAnswerIndex)))) {
                nQuestion++;
                System.out.println("Correct!");
                if (trueFalseQ.difficulty().equals("Easy")) {
                    points = scoreTF += 2;
                    possiblePoints += points;
                } else if (trueFalseQ.difficulty().equals("Medium")) {
                    points = scoreTF += 3;
                    possiblePoints += points;
                } else {
                    points = scoreTF += 5;
                    possiblePoints += points;
                }
            } else {
                System.out.println("Incorrect. The correct answer is: " + correctAnswer);
            }
        }
        System.out.println("Quiz complete!");
        System.out.println("True False score is: " + points);
        System.out.println("Possible points in this section is: " + possiblePoints);
        return scoreTF;
    }


}