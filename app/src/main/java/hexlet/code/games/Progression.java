package hexlet.code.games;

import hexlet.code.Utils;
import org.apache.commons.math3.util.Pair;

public final class Progression implements Game {

    private static final int START_NUMBER_MAX = 50;
    private static final int STEP_MAX = 15;
    private static final int MAX = 10;
    private static final int MIN = 5;

    @Override
    public String getTask() {
        return "What number is missing in the progression?";
    }

    @Override
    public Pair<String, String> getAssignment() {

        String[] progression = getNewArray();
        int index = Utils.getNewRandomNumber(progression.length);

        String answer = progression[index];

        progression[index] = "..";
        String task = String.join(" ", progression);

        return new Pair<>(task, answer);
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
