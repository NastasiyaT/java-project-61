package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Arrays;

public final class GCD implements Game {
    public static final String GCD_NAME = "GCD";

    @Override
    public void printTask() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    @Override
    public String getQuestion() {
        int num1 = Utils.getNewRandomNumber(Utils.BOUNDARY);
        int num2 = Utils.getNewRandomNumber(Utils.BOUNDARY);
        return num1 + " " + num2;
    }

    @Override
    public String getAnswer(String question) {
        String[] nums = question.split(" ");
        int[] vals = Arrays.stream(nums)
                .mapToInt(Integer::parseInt)
                .toArray();

        int val1 = vals[0];
        int val2 = vals[1];

        int result = commonDivisor(val1, val2);

        return String.valueOf(result);
    }

    private static int commonDivisor(int a, int b) {
        if (a == 0) {
            return b;
        }
        return commonDivisor(b % a, a);
    }
}
