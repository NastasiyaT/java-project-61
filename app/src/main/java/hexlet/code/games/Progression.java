package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {
    public static final int START_NUMBER_MAX = 50;
    public static final int STEP_MAX = 15;
    public static final int MAX = 10;
    public static final int MIN = 5;

    public static void startProgression() {
        String[][] issues = new String[Engine.GAME_ROUND][2];

        for (String[] issue : issues) {
            String[] reactions = generateRoundData();
            issue[0] = reactions[0];
            issue[1] = reactions[1];
        }

        String task = "What number is missing in the progression?";

        Engine.playGame(task, issues);
    }

    public static String[] generateRoundData() {
        String[] items = {"Question", "Answer"};

        int itemsCount = Utils.getNewRandomNumber(MAX - MIN) + MIN;
        int seed = Utils.getNewRandomNumber(START_NUMBER_MAX);
        int count = Utils.getNewRandomNumber(STEP_MAX) + 1;

        String[] units = getNewArray(itemsCount, seed, count);

        int place = Utils.getNewRandomNumber(units.length);

        String hiddenNumber = units[place];
        units[place] = "..";

        items[0] = String.join(" ", units);
        items[1] = hiddenNumber;

        return items;
    }

    public static String[] getNewArray(int arrayLength, int firstNumber, int step) {
        String[] cases = new String[arrayLength];
        int t = firstNumber;

        for (int s = 0; s < arrayLength; s++) {
            cases[s] = Integer.toString(t);
            t += step;
        }

        return cases;
    }
}
