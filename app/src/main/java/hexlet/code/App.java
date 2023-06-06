package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

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

        Scanner input = new Scanner(System.in);
        int gameChoice = input.nextInt();

        String gameName = games[gameChoice];

        switch (gameName) {
            case "Exit" -> input.close();

            case "Greet" -> {
                System.out.println();
                System.out.println("Welcome to the Brain Games!");
                System.out.println("May I have your name? ");
                String name = input.next();
                System.out.println("Hello, " + name + "!");
            }

            case "Even" -> Even.numberEvenOrNot();

            case "Calc" -> Calc.getEquation();

            case "GCD" -> GCD.findGCD();

            case "Progression" -> Progression.startProgression();

            case "Prime" -> Prime.numberPrimeOrNot();

            default -> throw new Error("Unknown game: " + gameName + "!");
        }
    }
}
