package com.deved.quiz;

public abstract class Question {

    static int nQuestions = 0;
    static int nCorrect = 0;

    String correctAnswer;

    public Question() {
    }
    abstract String ask();
    public void check() {
        nQuestions++;
        String answer = ask();

        if (answer.equals(correctAnswer)) {
            nCorrect++;
            System.out.println(answer + "\nCorrect!");
        } else {
            System.out.println(answer + "\nIncorrect!");
        }
    }

    static void showResults() {
        System.out.println("questions: " + nQuestions + "\nCorrect Answers: " + nCorrect);
    }


}