package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner input = new Scanner(System.in);
    private static String name;
    private static int userChoiceNumber;
    private static String userChoiceLine;

    public static void greeting() {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static String getName() {
        return name;
    }

    public static void askAnswerNumber() {
        System.out.print("Your answer: ");
        userChoiceNumber = input.nextInt();
    }

    public static int getAnswerNumber() {
        return userChoiceNumber;
    }

    public static void askAnswerLine() {
        System.out.print("Your answer: ");
        userChoiceLine = input.nextLine();
    }

    public static String getAnswerLine() {
        return userChoiceLine;
    }

    public static void reactionNumber(int answerToCompare, int result) {
        if (answerToCompare == result) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answerToCompare + "' is wrong answer ;(. Correct answer was '" + result + "'");
            System.out.println("Let's try again, " + name + "!");
        }
    }

    public static void reactionLine(String answerToCompare, String result) {
        if (answerToCompare.equalsIgnoreCase(result)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answerToCompare + "' is wrong answer ;(. Correct answer was '" + result + "'");
            System.out.println("Let's try again, " + name + "!");
        }
    }

    public static void congratulation(int n) {
        if (n == 3) {
            System.out.println("Congratulations!");
        }
    }
}
