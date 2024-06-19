package hexlet.code;

import hexlet.code.games.*;
import org.apache.commons.math3.util.Pair;

import java.util.Map;
import java.util.Scanner;

public class Engine {

    private static final Map<Option, Game> games = Map.of(
            Option.Even, new Even(),
            Option.Calc, new Calc(),
            Option.GCD, new GCD(),
            Option.Progression, new Progression(),
            Option.Prime, new Prime()
    );

    private static final int GAME_ROUND = 3;

    public static void playGame(Option choice) {
        Game gameToPlay = games.get(choice);
        System.out.println(gameToPlay.getTask());
        Scanner input = new Scanner(System.in);

        for (int m = 0; m < GAME_ROUND; m++) {
            Pair<String, String> assignment = gameToPlay.getAssignment();

            String task = assignment.getKey();

            System.out.printf("Question: %s%n", task);
            System.out.print("Your answer: ");
            String userAnswer = input.nextLine();

            String response = assignment.getValue();

            if (userAnswer.equalsIgnoreCase(response)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(.%n", userAnswer);
                System.out.printf("Correct answer was '%s'.%n", response);
                System.out.printf("Let's try again, %s!%n", Utils.userName);
                return;
            }
        }

        System.out.printf("Congratulations, %s!%n", Utils.userName);
    }
}
