package hexlet.code.games;

import hexlet.code.Utils;
import org.apache.commons.math3.primes.Primes;

public final class Prime implements Game {
    public static final String PRIME_NAME = "Prime";

    @Override
    public void printTask() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    @Override
    public String getQuestion() {
        int num = Utils.getNewRandomNumber(Utils.BOUNDARY);
        return String.valueOf(num);
    }

    @Override
    public String getAnswer(String question) {
        int val = Integer.parseInt(question);

        if (Primes.isPrime(val)) {
            return "yes";
        } else {
            return "no";
        }
    }
}
