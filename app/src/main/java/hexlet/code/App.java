package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter");
        String[] games = {"Exit", "Greet", "Even", "Calc", "GCD", "Progression", "Prime"};
        for (int i = 1; i < games.length; i++) {
            System.out.print(i + " - ");
            System.out.println(games[i]);
        }
        System.out.println("0 - " + games[0]);
        System.out.print("Your choice: ");

        Scanner game = new Scanner(System.in);
        int gameChoice = game.nextInt();

        switch (gameChoice) {
            case 1 -> Engine.greeting();

            case 2 -> Even.numberEvenOrNot();

            case 3 -> Calc.equation();

            case 4 -> GCD.getGCD();

            case 5 -> Progression.guessNumber();

            case 6 -> Prime.guessPrimeNumber();

            default -> game.close();
        }
    }
}
