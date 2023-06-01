package hexlet.code;

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

        if (gameChoice == 0) {
            input.close();
        } else {
            System.out.println();
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name? ");
            String name = input.next();
            System.out.println("Hello, " + name + "!");

            if (gameChoice == 1) {
                input.close();
            } else {
                Engine.playGame(gameName, name);
            }
        }
    }
}
