package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner newName = new Scanner(System.in);
        System.out.println("May I have your name?");

        String userName = newName.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
