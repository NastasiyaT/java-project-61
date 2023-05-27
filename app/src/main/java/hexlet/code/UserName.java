package hexlet.code;

import java.util.Scanner;

public class UserName {
    private static Scanner input = new Scanner(System.in);
    private static String name;
    private static int userChoice;

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

    public static void askAnswer() {
        System.out.print("Your answer: ");
        userChoice = input.nextInt();
    }

    public static int getAnswer() {
        return userChoice;
    }

    public static void reaction(int userAnswer, int result) {
        if (userAnswer == result) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + result + "'");
            System.out.println("Let's try again, " + UserName.getName() + "!");
        }
    }
}
