package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Game;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Map;
import java.util.Scanner;

public class Engine {
    private static Map<String, Game> games = Map.of(
            Even.EVEN_NAME, new Even(),
            Calc.CALC_NAME, new Calc(),
            GCD.GCD_NAME, new GCD(),
            Progression.PROGRESSION_NAME, new Progression(),
            Prime.PRIME_NAME, new Prime()
    );

    private static Scanner input = new Scanner(System.in);
    private static final int GAME_ROUND = 3;

    public static void playGame(String choice) {
        Game gameToPlay = games.get(choice);

        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String userName = input.nextLine();
        System.out.println("Hello, " + userName + "!");

        gameToPlay.printTask();

        for (int m = 0; m < GAME_ROUND; m++) {
            String task = gameToPlay.getQuestion();

            System.out.println("Question: " + task);
            System.out.print("Your answer: ");
            String userAnswer = input.nextLine();

            String response = gameToPlay.getAnswer(task);

            if (userAnswer.equalsIgnoreCase(response)) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + response + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
