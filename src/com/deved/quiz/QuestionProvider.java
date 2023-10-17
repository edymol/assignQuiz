package com.deved.quiz;

public class QuestionProvider {
    public QuizQuestion[] initializeQuestions() {
        // Define your quiz questions here using the QuizQuestion record
        return new QuizQuestion[]{
                new QuizQuestion(
                        "What is the capital of France?",
                        new String[]{"Berlin", "Madrid", "Paris", "Rome"},
                        2,
                        "Easy"
                ),
                new QuizQuestion(
                        "Which planet is known as the Red Planet?",
                        new String[]{"Mars", "Venus", "Jupiter", "Saturn"},
                        0,
                        "Hard"
                ),
                new QuizQuestion(
                        "If you are breathing you are alive",
                        new String[]{"True", "False"},
                        0,
                        "Medium"
                ),
        };
    }
}
