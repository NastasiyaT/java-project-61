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

            System.out.println("Question: " + number);
            Engine.askAnswerLine();
            String userAnswer = Engine.getAnswerLine();

            String rightAnswer;
            if (Primes.isPrime(number)) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
            }

            if (userAnswer.equalsIgnoreCase(rightAnswer)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
                System.out.println("Let's try again, " + Engine.getName() + "!");
                break;
            }
        }

        Engine.congratulation(i);
    }
}
