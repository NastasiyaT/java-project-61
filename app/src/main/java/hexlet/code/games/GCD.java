package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    public static final int ROUND = 3;

    public static void findGCD() {
        String[][] issues = new String[ROUND][2];

        for (String[] issue : issues) {
            String[] reactions = generateRoundData();
            issue[0] = reactions[0];
            issue[1] = reactions[1];
        }

        String task = "Find the greatest common divisor of given numbers.";

        Engine.playGame(task, issues);
    }

    public static final int BOUNDARY = 100;

    public static String[] generateRoundData() {
        String[] items = {"Question", "Answer"};

        Random newNumber = new Random();
         int n1 = newNumber.nextInt(BOUNDARY);
         int n2 = newNumber.nextInt(BOUNDARY);

         items[0] = n1 + " " + n2;
         items[1] = Integer.toString(commonDivisor(n1, n2));

        return items;
    }

    public static int commonDivisor(int a, int b) {
        if (a == 0) {
            return b;
        }
        return commonDivisor(b % a, a);
    }
}
