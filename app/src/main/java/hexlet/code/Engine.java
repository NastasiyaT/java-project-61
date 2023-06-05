package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void playGame(String task, String[][] gameQuestionsAnswers, String userName) {
        Scanner input = new Scanner(System.in);

        System.out.println(task);

        int m = 0;
        final int gameROUND = 3;

        while (m < gameROUND) {
            System.out.println("Question: " + gameQuestionsAnswers[m][0]);
            System.out.print("Your answer: ");
            String userAnswer = input.nextLine();

            if (userAnswer.equalsIgnoreCase(gameQuestionsAnswers[m][1])) {
                System.out.println("Correct!");
                m++;
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
