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
        String[][] units = new String[][] {};
        String question = "";

        if (gameName.equals("Exit")) {
            input.close();
        } else {
            System.out.println();
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name? ");
            String name = input.next();
            System.out.println("Hello, " + name + "!");

            switch (gameName) {
                case "Greet" -> input.close();

                case "Even" -> {
                    question = Even.printQuestionEven();
                    units = Even.getQuestionAnswerEven();
                }

                case "Calc" -> {
                    question = Calc.printQuestionCalc();
                    units = Calc.getQuestionAnswerCalc();
                }

                case "GCD" -> {
                    question = GCD.printQuestionGCD();
                    units = GCD.getQuestionAnswerGCD();
                }

                case "Progression" -> {
                    question = Progression.printQuestionProgression();
                    units = Progression.getQuestionAnswerProgression();
                }

                case "Prime" -> {
                    question = Prime.printQuestionPrime();
                    units = Prime.getQuestionAnswerPrime();
                }

                default -> throw new Error("Unknown game: " + gameName + "!");
            }

            if (gameChoice != 1) {
                Engine.playGame(question, units, name);
            }
        }
    }
}
