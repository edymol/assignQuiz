package com.deved.quiz;

/*
 * In Java, a record is a class that is introduced in Java 16 to provide a more concise way to declare classes
 * primarily used to store data. A record automatically generates typical methods such as constructors, equals(),
 * hashCode(), and toString() methods based on the class's components. It's an efficient way to create simple
 * data-centric classes.*/
public record QuizQuestion(
        String question,
        String[] options,
        int correctAnswerIndex,
        String difficulty) {
}


/*
 public class QuizQuestion {
    private final String question;
    private final String[] options;
    private final int correctAnswerIndex;

    public QuizQuestion(String question, String[] options, int correctAnswerIndex) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }



}
*/
