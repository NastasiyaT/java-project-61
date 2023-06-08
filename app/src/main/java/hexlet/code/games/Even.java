package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void numberEvenOrNot() {
        String[][] issues = new String[Engine.GAME_ROUND][2];

        for (String[] issue : issues) {
            String[] reactions = generateRoundData();
            issue[0] = reactions[0];
            issue[1] = reactions[1];
        }

        String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        Engine.playGame(task, issues);
    }

    public static String[] generateRoundData() {
        String[] items = {"Question", "Answer"};

        int q = Utils.getNewRandomNumber(Utils.BOUNDARY);
        items[0] = Integer.toString(q);

        if (isEven(q)) {
            items[1] = "yes";
        } else {
            items[1] = "no";
        }

        return items;
    }

    public static boolean isEven(int r) {
        return r % 2 == 0;
    }
}
