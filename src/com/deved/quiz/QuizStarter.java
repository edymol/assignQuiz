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

    public void start() throws StopGameException {
        Scanner input = new Scanner(System.in);
        StringBuilder playerName;

        System.out.println("Enter your name: ");
        playerName = new StringBuilder(input.nextLine().toUpperCase());

        int start;

        while (true) {
            System.out.println(playerName + " When you are ready, press 1 to start or 2 to quit");
            start = input.nextInt();

            if (start == 1) {
                System.out.println("Start game");
                break; // Exit the loop and start the quiz when 1 is pressed
            } else if (start == 2) {
                throw new StopGameException("You have stopped the game");
                // Exit the method when 2 is pressed
            } else {
                System.out.println("Enter a valid number (1 or 2)");
            }
        }

        QuestionProvider questionProvider = new QuestionProvider();
        TrueFalseArray trueFalseArray = new TrueFalseArray();
        QuizQuestion[] questions = questionProvider.initializeQuestions();
        QuizQuestion[] trueFalse = trueFalseArray.trueFalseQuestion();
        MultipleChoiceChecker answerChecker = new MultipleChoiceChecker();
        CheckTrueFalse checkTF = new CheckTrueFalse();
        int score = answerChecker.checkAnswers(questions);
        int scoreTF = checkTF.checkTF(trueFalse);
        System.out.println("Base on level of difficulty you have " +score + scoreTF + " points");

    }
}
