package com.deved.quiz;

public class Quiz {

    public static void main(String[] args) {
        Question question = new MultipleChoiceQuestion("Which of these is a USA holiday?",
                "4th of July",
                "The moon festival",
                "The water renaissance",
                "Saint Patrick's Day",
                "Monkey Day", "A");

        question.check();

        String question1 = "What is the value of Pi?\n";

        question = new MultipleChoiceQuestion(question1, "3.2", "18", "3.1416", "0.1", "754", "C");

        question.check();

        String question2 = "In what years was the end of WWI?\n";

        question = new MultipleChoiceQuestion(question2, "1800", "1850", "1991", "2001", "1918", "E");

        question.check();

        String question3 = "Did Jack Sparrow fight in WWII?\n";

        question = new MultipleChoiceQuestion(question3, "yes", "no", "Only 1 year", "All the War", "None of above", "B");

        question.check();

        String question4 = "How will you end this programming class?\n";

        question = new MultipleChoiceQuestion(question4, "Tired", "Dead", "Very Happy", "Learning", "All of above", "E");

        question.check();

        Question questionTrueFalse = new TrueFalseQuestion("Is it true that is true", "TRUE");
        questionTrueFalse.check();

        Question.showResults();
    }
}