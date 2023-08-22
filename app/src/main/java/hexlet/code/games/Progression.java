package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Map;

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
    public Map<String, String> getAssignment() {

        String[] progression = getNewArray();
        int index = Utils.getNewRandomNumber(progression.length);

        String answer = progression[index];

        progression[index] = "..";
        String task = String.join(" ", progression);

        return Map.of(Utils.QUESTION, task,
                Utils.ANSWER, answer);
    }

    private static String[] getNewArray() {
        int itemsCount = Utils.getNewRandomNumber(MAX - MIN) + MIN;
        int start = Utils.getNewRandomNumber(START_NUMBER_MAX);
        int surplus = Utils.getNewRandomNumber(STEP_MAX) + 1;

        String[] cases = new String[itemsCount];
        int t = start;

        for (int i = 0; i < itemsCount; i++) {
            cases[i] = Integer.toString(t);
            t += surplus;
        }

        return cases;
    }
}
