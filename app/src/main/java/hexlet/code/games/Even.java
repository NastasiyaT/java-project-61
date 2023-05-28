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

            String rightAnswer;
            if (leftover == 0) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
            }

            Engine.reactionLine(userAnswer, rightAnswer);

            if (userAnswer.equalsIgnoreCase(rightAnswer)) {
                i++;
            } else {
                i = 4;
            }
        }

        Engine.congratulation(i);
    }
}
