package hexlet.code.games;

import org.apache.commons.math3.primes.Primes;
import java.util.Random;

public class Prime {
    public static String printQuestionPrime() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String[][] getQuestionAnswerPrime() {
        final int round = 3;
        int questionAnswer = 2;
        String[][] items = new String[round][questionAnswer];

        for (int i = 0; i < round; i++) {
            Random newNumber = new Random();
            final int boundary100 = 100;

            int number = newNumber.nextInt(boundary100);

            items[i][0] = Integer.toString(number);
            items[i][1] = "no";
            if (Primes.isPrime(number)) {
                items[i][1] = "yes";
            }
        }

        return items;
    }
}
