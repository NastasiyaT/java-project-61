package hexlet.code.games;

import hexlet.code.Engine;

import org.apache.commons.math3.primes.Primes;
import java.util.Random;

public class Prime {
    public static final int ROUND = 3;

    public static void numberPrimeOrNot() {
        String[][] issues = new String[ROUND][2];

        for (String[] issue : issues) {
            String[] reactions = generateRoundData();
            issue[0] = reactions[0];
            issue[1] = reactions[1];
        }

        String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        Engine.playGame(task, issues);
    }

    public static final int BOUNDARY = 100;

    public static String[] generateRoundData() {
        String[] items = {"Question", "Answer"};

        Random newNumber = new Random();
        int number = newNumber.nextInt(BOUNDARY);

        items[0] = Integer.toString(number);

        if (Primes.isPrime(number)) {
            items[1] = "yes";
        } else {
            items[1] = "no";
        }

        return items;
    }
}
