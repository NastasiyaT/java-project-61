package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {

    public static int commonDivisor(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        }
        return commonDivisor(n2 % n1, n1);
    }

    public static void getGCD() {
        Engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");

        int i = 0;

        while (i < 3) {
            Random item = new Random();
            int number1 = item.nextInt(100);
            int number2 = item.nextInt(100);
            int rightAnswer = commonDivisor(number1, number2);

            System.out.println("Question: " + number1 + " " + number2);
            Engine.askAnswerNumber();
            int userAnswer = Engine.getAnswerNumber();

            Engine.reactionNumber(userAnswer, rightAnswer);

            if (userAnswer == rightAnswer) {
                i++;
            } else {
                i = 4;
            }
        }

        Engine.congratulation(i);
    }
}
