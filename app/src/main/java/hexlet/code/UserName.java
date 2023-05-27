package hexlet.code;

import java.util.Scanner;

public class UserName {
    private static Scanner input = new Scanner(System.in);
    private static String name;

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
}
