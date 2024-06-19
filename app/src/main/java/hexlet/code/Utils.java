package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Utils {

    static String userName;

    public static final int BOUNDARY = 100;

    public static int getNewRandomNumber(int edge) {
        Random newNumber = new Random();
        return newNumber.nextInt(edge);
    }

    static void printGameChoice() {
        System.out.println("Please enter the game number and press Enter");

        for (Option n : Option.values()) {
            System.out.printf("%d - %s%n", n.getNumber(), n.name());
        }

        System.out.print("Your choice: ");
    }

    static void printWelcomeMessage() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner input = new Scanner(System.in);
        userName = input.nextLine();
        System.out.printf("Hello, %s!%n", userName);
    }
}
