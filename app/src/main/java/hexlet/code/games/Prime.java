package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.math3.primes.Primes;
import java.util.Random;

public class Prime {
    public static void guessPrimeNumber() {
        Engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

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
            if (Primes.isPrime(number)) {
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
