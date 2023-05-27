package hexlet.code;

import java.util.Scanner;

public class UserName {
    private static Scanner input = new Scanner(System.in);
    private static String item;

    public static void greeting() {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        item = input.nextLine();
        System.out.println("Hello, " + item + "!");
    }

    public static String getName() {
        return item;
    }
}
