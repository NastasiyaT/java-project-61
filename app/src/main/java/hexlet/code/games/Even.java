package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void numberEvenOrNot() {
        Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int i = 0;
        int round = Engine.getRoundCount();

        while (i < round) {
            Random item = new Random();
            int boundary = Engine.getRandomBoundary();
            int number = item.nextInt(boundary);

            System.out.println("Question: " + number);
            Engine.askAnswerLine();
            String userAnswer = Engine.getAnswerLine();

            String rightAnswer = "no";
            if (number % 2 == 0) {
                rightAnswer = "yes";
            }

            Engine.reactionLine(userAnswer, rightAnswer);

            if (userAnswer.equalsIgnoreCase(rightAnswer)) {
                i++;
            } else {
                i = round + 1;
            }
        }

        Engine.congratulation(i, round);
    }
}
