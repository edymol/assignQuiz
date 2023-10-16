package com.deved.quiz;

import java.util.Scanner;

public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion(String question,
                                  String a,
                                  String b,
                                  String c,
                                  String d,
                                  String e,
                                  String answer) {
        super();
        correctAnswer = answer;
        // Implement your logic for displaying and processing multiple-choice questions here.
        System.out.println(question);
        System.out.println("A. " + a);
        System.out.println("B. " + b);
        System.out.println("C. " + c);
        System.out.println("D. " + d);
        System.out.println("E. " + e);
    }

    @Override
    String ask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your answer (A/B/C/D/E): ");
        return scanner.next().toUpperCase();
    }
}