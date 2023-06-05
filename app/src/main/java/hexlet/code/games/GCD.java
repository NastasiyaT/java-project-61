package hexlet.code.games;

import java.util.Random;

public class GCD {
    public static String printQuestionGCD() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static int commonDivisor(int a, int b) {
        if (a == 0) {
            return b;
        }
        return commonDivisor(b % a, a);
    }

    public static String[][] getQuestionAnswerGCD() {
        final int round = 3;
        int questionAnswer = 2;
        String[][] items = new String[round][questionAnswer];

        for (int i = 0; i < round; i++) {
            Random newNumber = new Random();
            final int boundary100 = 100;

            int number1 = newNumber.nextInt(boundary100);
            int number2 = newNumber.nextInt(boundary100);

            items[i][0] = number1 + " " + number2;
            items[i][1] = Integer.toString(commonDivisor(number1, number2));
        }

        return items;
    }
}
