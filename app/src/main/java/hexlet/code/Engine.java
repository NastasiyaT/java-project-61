package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class Engine {
    public static void userChoice() {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        Scanner game = new Scanner(System.in);
        int gameChoice = game.nextInt();

        switch (gameChoice) {
            case 1 -> {
                Greeting.hello();
                game.close();
            }

            case 2 -> Even.numberEvenOrNot();

            case 3 -> Calc.equation();

            case 4 -> GCD.getGCD();

            case 5 -> Progression.guessNumber();

            default -> game.close();
        }
    }
}
