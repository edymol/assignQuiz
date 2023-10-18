package com.deved.quiz;

public class Quiz {

    public static void main(String[] args) throws StopGameException {
        QuizStarter gameStarter = new QuizStarter();
        gameStarter.greeting();
        try {
            gameStarter.start();
        }catch (StopGameException exit){
            System.out.println(exit.getMessage());

        }
    }
}