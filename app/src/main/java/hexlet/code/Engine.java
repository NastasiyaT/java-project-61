package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class Engine {
    public static void userChoice() {
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

            default -> game.close();
        }
    }
}
