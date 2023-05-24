package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        Scanner gameChoice = new Scanner(System.in);

        if (gameChoice.nextInt() == 1) {
            System.out.println("Your choice: 1");
            System.out.println();

            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            Scanner userName = new Scanner(System.in);
            System.out.println("Hello, " + userName.nextLine() + "!");
        } else {
            gameChoice.close();
        }
    }
}
