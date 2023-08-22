package hexlet.code.games;

import hexlet.code.Utils;
import org.apache.commons.math3.primes.Primes;

import java.util.Map;

public final class Prime implements Game {
    public static final String PRIME_NAME = "Prime";

    @Override
    public void printTask() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    @Override
    public Map<String, String> getAssignment() {

        int num = Utils.getNewRandomNumber(Utils.BOUNDARY);

        if (num == 0 || num == 1) {
            num = Utils.getNewRandomNumber(Utils.BOUNDARY);
        }

        String task = String.valueOf(num);
        String answer = "";

        if (Primes.isPrime(num)) {
            answer = "yes";
        } else {
            answer = "no";
        }

        return Map.of(Utils.QUESTION, task,
                Utils.ANSWER, answer);
    }
}
