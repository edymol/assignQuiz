package com.deved.quiz;

import java.util.Scanner;

public class QuizStarter {
    public void greeting() {
        System.out.println("********************");
        System.out.println("Welcome to the quiz game");
        System.out.println("********************");
        System.out.println();
        System.out.println("The rules of the game are simple.");
        System.out.println("You will be presented with different questions and answer as many as possible");
        System.out.println("********************");
    }

    public void start() {
        Scanner input = new Scanner(System.in);
        String playerName;

        System.out.println("Enter your name: ");
        playerName = input.nextLine().toUpperCase();

        int start;

        while (true) {
            System.out.println(playerName + " When you are ready, press 1 to start or 2 to quit");
            start = input.nextInt();

            if (start == 1) {
                System.out.println("Start game");
                break; // Exit the loop and start the quiz when 1 is pressed
            } else if (start == 2) {
                System.out.println("Stopping game");
                return; // Exit the method when 2 is pressed
            } else {
                System.out.println("Enter a valid number (1 or 2)");
            }
        }

        QuestionProvider questionProvider = new QuestionProvider();
        QuizQuestion[] questions = questionProvider.initializeQuestions();

        AnswerChecker answerChecker = new AnswerChecker();
        int score = answerChecker.checkAnswers(questions);
        System.out.println("Base on level of difficulty you have " +score + "points");

    }
}
