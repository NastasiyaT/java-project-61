package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static final int ROUND = 3;

    public static void startProgression() {
        String[][] issues = new String[ROUND][2];

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

        Random newNumber = new Random();
        int[] units = getNewArray();
        int place = newNumber.nextInt(units.length);

        items[0] = printArray(units, place);
        items[1] = Integer.toString(units[place]);

        return items;
    }

    public static final int START_NUMBER_MAX = 50;
    public static final int STEP_MAX = 15;
    public static final int MAX = 10;
    public static final int MIN = 5;

    public static int[] getNewArray() {
        Random count = new Random();
        int itemsCount = count.nextInt(MAX - MIN) + MIN;
        int[] cases = new int[itemsCount];

        int seed = count.nextInt(START_NUMBER_MAX);

        int step = count.nextInt(STEP_MAX) + 1;

        for (int n = 0; n < itemsCount; n++) {
            cases[n] = seed;
            seed += step;
        }

        return cases;
    }

    public static String printArray(int[] items, int space) {
        StringBuilder printedArray = new StringBuilder();

        for (int x = 0; x < space; x++) {
            printedArray.append(items[x]);
            printedArray.append(" ");
        }

        printedArray.append(".. ");

        for (int y = space + 1; y < items.length; y++) {
            printedArray.append(items[y]);
            printedArray.append(" ");
        }

        return printedArray.toString();
    }
}
