package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
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

        String gameName = games[gameChoice];

        switch (gameName) {
            case "Greet" -> Engine.greeting();

            case "Even" -> Even.numberEvenOrNot();

            case "Calc" -> Calc.equation();

            case "GCD" -> GCD.getGCD();

            case "Progression" -> Progression.guessNumber();

            case "Prime" -> Prime.guessPrimeNumber();

            default -> game.close();
        }
    }
}
