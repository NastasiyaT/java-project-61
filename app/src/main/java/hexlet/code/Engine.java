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

    public static final String WELCOME_MESSAGE = "\nWelcome to the Brain Games!";
    public static final String GREETING_MESSAGE = "May I have your name?";

    private static Scanner input = new Scanner(System.in);
    private static final int GAME_ROUND = 3;

    public static void playGame(String choice) {
        Game gameToPlay = games.get(choice);

        System.out.println(WELCOME_MESSAGE);
        System.out.println(GREETING_MESSAGE);
        String userName = input.nextLine();
        System.out.printf("Hello, %s!%n", userName);
        System.out.println(gameToPlay.getTask());

        for (int m = 0; m < GAME_ROUND; m++) {
            Map<String, String> assignment = gameToPlay.getAssignment();

            String task = assignment.get(Utils.QUESTION);

            System.out.printf("Question: %s%n", task);
            System.out.print("Your answer: ");
            String userAnswer = input.nextLine();

            String response = assignment.get(Utils.ANSWER);

            if (userAnswer.equalsIgnoreCase(response)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(.%n", userAnswer);
                System.out.printf("Correct answer was '%s'.%n", response);
                System.out.printf("Let's try again, %s!%n", userName);
                return;
            }
        }

        System.out.printf("Congratulations, %s!%n", userName);
    }
}
