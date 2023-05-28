package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.math3.primes.Primes;
import java.util.Random;

public class Prime {
    public static void guessPrimeNumber() {
        Engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int i = 0;

        while (i < 3) {
            Random item = new Random();
            int number = item.nextInt(100);

            String rightAnswer;
            if (Primes.isPrime(number)) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
            }

            System.out.println("Question: " + number);
            Engine.askAnswerLine();
            String userAnswer = Engine.getAnswerLine();

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
