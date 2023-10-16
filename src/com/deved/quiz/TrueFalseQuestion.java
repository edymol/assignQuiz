package com.deved.quiz;

import java.util.Scanner;

public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String question, String answer) {
        super();
        this.correctAnswer = answer;
        // Implement your logic for displaying and processing True/False questions here.
        System.out.println(question);
    }

    @Override
    String ask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your answer (TRUE/FALSE): ");
        return scanner.next().toUpperCase();
    }
}