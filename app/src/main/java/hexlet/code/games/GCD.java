package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Map;

public final class GCD implements Game {
    public static final String GCD_NAME = "GCD";

    @Override
    public void printTask() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    @Override
    public Map<String, String> getAssignment() {

        int num1 = Utils.getNewRandomNumber(Utils.BOUNDARY);
        int num2 = Utils.getNewRandomNumber(Utils.BOUNDARY);
        int gcd = commonDivisor(num1, num2);

        String task = num1 + " " + num2;
        String answer = String.valueOf(gcd);

        return Map.of(Utils.QUESTION, task,
                Utils.ANSWER, answer);
    }

    private static int commonDivisor(int a, int b) {
        if (a == 0) {
            return b;
        }
        return commonDivisor(b % a, a);
    }
}
