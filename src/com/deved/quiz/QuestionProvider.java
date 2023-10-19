package com.deved.quiz;

public class QuestionProvider {
    public QuizQuestion[] initializeQuestions() {
        return new QuizQuestion[]{
                //  Easy Questions
//                new QuizQuestion(
//                        "What does JVM stand for in Java?",
//                        new String[]
//                                {"Java Virtual Machine", "Just Very Mighty", "Jungle Virtual Mode",
//                                        "Java Variable Modifier"},
//                        0,
//                        "Easy"),
//                new QuizQuestion(
//                        "Which data type is used for storing a single character in Java?",
//                        new String[]{"char", "int", "String", "float"},
//                        0,
//                        "Easy"),
//                new QuizQuestion(
//                        "What is the output of 'System.out.println(5 + 3 + \"Java\");'?",
//                        new String[]{"8Java", "53Java", "5+3Java", "Error"},
//                        1,
//                        "Easy"),
//                new QuizQuestion(
//                        "Which Java keyword is used to define a constant?",
//                        new String[]{"const", "final", "static", "constant"},
//                        1,
//                        "Easy"),
//                new QuizQuestion(
//                        "What is the purpose of the 'break' statement in Java?",
//                        new String[]{"To terminate a loop", "To skip the current iteration of a loop",
//                                "To define a constant", "To create an object"},
//                        0,
//                        "Easy"),
//                new QuizQuestion(
//                        "What is a 'compiler' in Java?",
//                        new String[]{"A program that translates Java source code into bytecode",
//                                "A program that runs Java applications", "A Java keyword", "A data type"},
//                        0,
//                        "Easy"),
//                new QuizQuestion(
//                        "How do you declare an integer variable in Java?",
//                        new String[]{"int x;", "integer x;", "x = int;", "var x = int;"},
//                        0,
//                        "Easy"),
//                new QuizQuestion(
//                        "What is the result of 'true && false' in Java?",
//                        new String[]{"true", "false", "Error", "Both true and false"},
//                        1,
//                        "Easy"),
//                new QuizQuestion(
//                        "What is the default value of an uninitialized integer variable in Java?",
//                        new String[]{"0", "1", "null", "Error"},
//                        0,
//                        "Easy"),
//                new QuizQuestion(
//                        "Which Java keyword is used to create a new instance of a class?",
//                        new String[]{"new", "create", "instance", "make"},
//                        0,
//                        "Easy"),
//
//                // Medium Questions
//                new QuizQuestion(
//                        "What is the difference between 'ArrayList' and 'LinkedList' in Java?",
//                        new String[]{"ArrayList is faster for random access, LinkedList is faster for " +
//                                "insertions/deletions", "ArrayList is always faster than LinkedList",
//                                "LinkedList is faster for random access, ArrayList is faster for insertions/deletions",
//                                "There is no difference"},
//                        0,
//                        "Medium"),
//                new QuizQuestion(
//                        "What is the 'NullPointerException' in Java?",
//                        new String[]{"An exception that occurs when a null object is accessed",
//                                "A type of data structure", "A built-in Java class",
//                                "A common error in Java programs"},
//                        0,
//                        "Medium"),
//                new QuizQuestion(
//                        "What is the purpose of 'this' keyword in Java?",
//                        new String[]{"To refer to the current instance of the class", "To create a new object",
//                                "To call a superclass constructor", "To access static members"},
//                        0,
//                        "Medium"),
//                new QuizQuestion(
//                        "What is a 'JavaBean' in Java?",
//                        new String[]{"A reusable software component", "A type of coffee", "A built-in Java class",
//                                "A design pattern"},
//                        0,
//                        "Medium"),
//                new QuizQuestion(
//                        "What is method overloading in Java?",
//                        new String[]{"Defining multiple methods with the same name but different parameters",
//                                "Using too many methods in a class", "Changing the name of a method",
//                                "Running multiple methods at the same time"},
//                        0,
//                        "Medium"),
//                new QuizQuestion(
//                        "What is a 'static' method in Java?",
//                        new String[]{"A method that belongs to the class, not to any specific instance",
//                                "A method that cannot be called", "A method with a fixed return type",
//                                "A method with no parameters"},
//                        0,
//                        "Medium"),
//                new QuizQuestion(
//                        "What is the purpose of 'try', 'catch', and 'finally' in Java?",
//                        new String[]{"Handling exceptions in Java programs", "Creating new objects", "Defining classes",
//                                "Declaring variables"},
//                        0,
//                        "Medium"),
//                new QuizQuestion(
//                        "What is the 'super' keyword in Java used for?",
//                        new String[]{"To call a superclass constructor or method", "To create an object",
//                                "To access static members", "To define a constant"},
//                        0,
//                        "Medium"),
//                new QuizQuestion(
//                        "What is the 'java.lang' package in Java?",
//                        new String[]{"The core package that is automatically imported",
//                                "A package for advanced programming", "A package for handling user input",
//                                "A package for graphics and GUI components"},
//                        0,
//                        "Medium"),
//                new QuizQuestion(
//                        "What is the 'hashCode' method used for in Java?",
//                        new String[]{"To compute a hash code for an object", "To display a message",
//                                "To compare two objects", "To convert an object to a string"},
//                        0,
//                        "Medium"),
//
//                // Hard Questions
//                new QuizQuestion(
//                        "What is the result of '10 / 0' in Java?",
//                        new String[]{"Error (ArithmeticException)", "0", "10", "Infinity"},
//                        0,
//                        "Hard"),
//                new QuizQuestion(
//                        "What is the purpose of 'transient' in Java?",
//                        new String[]{"To prevent a field from being serialized", "To make a field read-only",
//                                "To create an object", "To define a constant"},
//                        0,
//                        "Hard"),
//                new QuizQuestion(
//                        "What is the 'equals' method used for in Java?",
//                        new String[]{"To compare the contents of two objects", "To create a new object", "To call a " +
//                                "superclass constructor", "To access static members"},
//                        0,
//                        "Hard"),
//                new QuizQuestion(
//                        "What is a 'lambda expression' in Java?",
//                        new String[]{"A concise way to define an anonymous function", "A type of exception",
//                                "A class in the java.util package", "A built-in Java class"},
//                        0,
//                        "Hard"),
//                new QuizQuestion(
//                        "What is the 'volatile' keyword used for in Java?",
//                        new String[]{"To indicate that a variable may be modified by multiple threads",
//                                "To make a variable constant", "To create a new thread", "To access static members"},
//                        0,
//                        "Hard"),
//                new QuizQuestion(
//                        "What is a 'singleton pattern' in Java?",
//                        new String[]{"A design pattern that restricts the instantiation of a class to one instance",
//                                "A pattern for working with collections", "A pattern for database access",
//                                "A pattern for handling exceptions"},
//                        0,
//                        "Hard"),
//                new QuizQuestion(
//                        "What is the 'autoboxing' feature in Java?",
//                        new String[]{"The automatic conversion of primitive types to their corresponding wrapper " +
//                                "classes", "The automatic casting of variables",
//                                "The automatic generation of JavaBeans",
//                                "The automatic generation of constructors"},
//                        0,
//                        "Hard"),
//                new QuizQuestion(
//                        "What is the 'assert' statement in Java used for?",
//                        new String[]{"To check for program correctness during development",
//                                "To print a message to the console", "To declare a variable", "To handle exceptions"},
//                        0,
//                        "Hard"),
//                new QuizQuestion(
//                        "What is the 'ClassNotFoundException' in Java?",
//                        new String[]{"An exception that occurs when a class is not found at runtime",
//                                "A built-in Java class", "A type of data structure", "A common error in Java programs"},
//                        0,
//                        "Hard"),
                new QuizQuestion(
                        "What is the 'java.nio' package in Java?",
                        new String[]{"A package for non-blocking I/O operations", "A package for GUI components",
                                "A package for database access", "A package for mathematical calculations"},
                        0,
                        "Hard"),

                // True false questions
//
        };
    }
}
