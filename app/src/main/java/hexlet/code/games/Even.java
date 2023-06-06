package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static final int ROUND = 3;

    public static void numberEvenOrNot() {
        String[][] issues = new String[ROUND][2];

        for (String[] issue : issues) {
            String[] reactions = generateRoundData();
            issue[0] = reactions[0];
            issue[1] = reactions[1];
        }

        String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        Engine.playGame(task, issues);
    }

    public static final int BOUNDARY = 100;

    public static String[] generateRoundData() {
        String[] items = {"Question", "Answer"};

        Random newNumber = new Random();
        int q = newNumber.nextInt(BOUNDARY);
        items[0] = Integer.toString(q);

        if (q % 2 == 0) {
            items[1] = "yes";
        } else {
            items[1] = "no";
        }

        return items;
    }
}
