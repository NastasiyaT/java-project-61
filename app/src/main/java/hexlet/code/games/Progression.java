package hexlet.code.games;

import java.util.Random;

public class Progression {
    public static void printQuestionProgression() {
        System.out.println("What number is missing in the progression?");
    }

    public static int[] getNewArray() {
        Random count = new Random();
        final int max10 = 10;
        final int min5 = 5;
        int itemsCount = count.nextInt(max10 - min5) + min5;
        int[] cases = new int[itemsCount];

        final int startNumberMaximum = 50;
        int seed = count.nextInt(startNumberMaximum);

        final int stepMaximum = 15;
        int step = count.nextInt(stepMaximum) + 1;

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

    public static String[][] getQuestionAnswerProgression() {
        final int round = 3;
        int questionAnswer = 2;
        String[][] items = new String[round][questionAnswer];

        for (int i = 0; i < round; i++) {
            Random newNumber = new Random();

            int[] units = getNewArray();
            int place = newNumber.nextInt(units.length);

            items[i][0] = printArray(units, place);
            items[i][1] = Integer.toString(units[place]);
        }

        return items;
    }
}
