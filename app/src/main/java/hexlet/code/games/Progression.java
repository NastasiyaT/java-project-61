package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Arrays;
import java.util.List;

public final class Progression implements Game {
    public static final String PROGRESSION_NAME = "Progression";

    private static final int START_NUMBER_MAX = 50;
    private static final int STEP_MAX = 15;
    private static final int MAX = 10;
    private static final int MIN = 5;

    @Override
    public void printTask() {
        System.out.println("What number is missing in the progression?");
    }

    @Override
    public String getQuestion() {
        int itemsCount = Utils.getNewRandomNumber(MAX - MIN) + MIN;
        int start = Utils.getNewRandomNumber(START_NUMBER_MAX);
        int surplus = Utils.getNewRandomNumber(STEP_MAX) + 1;

        String[] units = getNewArray(itemsCount, start, surplus);

        int place = Utils.getNewRandomNumber(itemsCount);
        units[place] = "..";

        return String.join(" ", units);
    }

    @Override
    public String getAnswer(String question) {
        List<String> items = Arrays.asList(question.split(" "));
        int index = items.indexOf("..");

        int val1 = Integer.parseInt(items.get(index - 1));
        int val2 = Integer.parseInt(items.get(index + 1));

        int result = (val1 + val2) / 2;

        return String.valueOf(result);
    }

    private static String[] getNewArray(int arrayLength, int firstNumber, int step) {
        String[] cases = new String[arrayLength];
        int t = firstNumber;

        for (int s = 0; s < arrayLength; s++) {
            cases[s] = Integer.toString(t);
            t += step;
        }

        return cases;
    }
}
