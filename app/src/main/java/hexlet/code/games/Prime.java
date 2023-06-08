package hexlet.code.games;

import hexlet.code.Engine;

import hexlet.code.Utils;
import org.apache.commons.math3.primes.Primes;

public class Prime {
    public static void numberPrimeOrNot() {
        String[][] issues = new String[Engine.GAME_ROUND][2];

        for (String[] issue : issues) {
            String[] reactions = generateRoundData();
            issue[0] = reactions[0];
            issue[1] = reactions[1];
        }

        String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        Engine.playGame(task, issues);
    }

    public static String[] generateRoundData() {
        String[] items = {"Question", "Answer"};

        int number = Utils.getNewRandomNumber(Utils.BOUNDARY);

        items[0] = Integer.toString(number);

        if (Primes.isPrime(number)) {
            items[1] = "yes";
        } else {
            items[1] = "no";
        }

        return items;
    }
}
