package hexlet.code.games;

import hexlet.code.Utils;
import org.apache.commons.math3.primes.Primes;
import org.apache.commons.math3.util.Pair;

public final class Prime implements Game {

    @Override
    public String getTask() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public Pair<String, String> getAssignment() {

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

        return new Pair<>(task, answer);
    }
}
