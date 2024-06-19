package hexlet.code.games;

import hexlet.code.Utils;
import org.apache.commons.math3.util.Pair;

public final class GCD implements Game {

    @Override
    public String getTask() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public Pair<String, String> getAssignment() {

        int num1 = Utils.getNewRandomNumber(Utils.BOUNDARY);
        int num2 = Utils.getNewRandomNumber(Utils.BOUNDARY);
        int gcd = commonDivisor(num1, num2);

        String task = num1 + " " + num2;
        String answer = String.valueOf(gcd);

        return new Pair<>(task, answer);
    }

    private static int commonDivisor(int a, int b) {
        if (a == 0) {
            return b;
        }
        return commonDivisor(b % a, a);
    }
}
