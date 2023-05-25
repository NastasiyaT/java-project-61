package hexlet.code;

import java.util.Scanner;

public class UserName {
    private static Scanner input = new Scanner(System.in);
    private static String item;

    public static void receiveName() {
        System.out.println("May I have your name? ");
        String newName = input.nextLine();
        item = newName;
    }

    public static String getName() {
        return item;
    }
}
