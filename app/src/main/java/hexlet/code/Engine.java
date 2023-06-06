package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final Scanner input = new Scanner(System.in);
    public static final int GAME_ROUND = 3;

    public static void playGame(String quiz, String[][] gameQuestionsAnswers) {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String userName = input.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(quiz);

        for (int m = 0; m < GAME_ROUND; m++) {
            System.out.println("Question: " + gameQuestionsAnswers[m][0]);
            System.out.print("Your answer: ");
            String userAnswer = input.nextLine();

            if (userAnswer.equalsIgnoreCase(gameQuestionsAnswers[m][1])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + gameQuestionsAnswers[m][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
