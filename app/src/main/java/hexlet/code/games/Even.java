package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void numberEvenOrNot() {
        Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int i = 0;

        while (i < 3) {
            Random item = new Random();
            int number = item.nextInt(100);
            int leftover = number % 2;

            System.out.println("Question: " + number);
            Engine.askAnswerLine();
            String userAnswer= Engine.getAnswerLine();

            String antiResult = "";
            if (leftover == 0) {
                antiResult = "yes";
            } else {
                antiResult = "no";
            }

            if ((leftover == 0 && userAnswer.equalsIgnoreCase("yes"))
                    || (leftover != 0 && userAnswer.equalsIgnoreCase("no"))) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + antiResult + "'");
                System.out.println("Let's try again, " + Engine.getName() + "!");
                break;
            }
        }

        Engine.congratulation(i);
    }
}
