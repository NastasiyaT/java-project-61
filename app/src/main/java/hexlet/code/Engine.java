package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {
    private static Scanner input = new Scanner(System.in);

    public static void playGame(String userChoice, String userName) {
        String[][] units = new String[][] {};

        switch (userChoice) {
            case "Even" -> {
                Even.printQuestionEven();
                units = Even.getQuestionAnswerEven();
            }

            case "Calc" -> {
                Calc.printQuestionCalc();
                units = Calc.getQuestionAnswerCalc();
            }

            case "GCD" -> {
                GCD.printQuestionGCD();
                units = GCD.getQuestionAnswerGCD();
            }

            case "Progression" -> {
                Progression.printQuestionProgression();
                units = Progression.getQuestionAnswerProgression();
            }

            case "Prime" -> {
                Prime.printQuestionPrime();
                units = Prime.getQuestionAnswerPrime();
            }

            default -> input.close();
        }

        int m = 0;
        final int gameROUND = 3;

        while (m < gameROUND) {
            System.out.println("Question: " + units[m][0]);
            System.out.print("Your answer: ");
            String userAnswer = input.nextLine();

            if (userAnswer.equalsIgnoreCase(units[m][1])) {
                System.out.println("Correct!");
                m++;
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + units[m][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                m = gameROUND + 1;
            }
        }

        if (m == gameROUND) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
