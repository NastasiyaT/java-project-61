package hexlet.code.games;

import hexlet.code.Utils;
import org.apache.commons.math3.util.Pair;

public final class Even implements Game {

    @Override
    public String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public Pair<String, String> getAssignment() {

        int num = Utils.getNewRandomNumber(Utils.BOUNDARY);

        String task = String.valueOf(num);
        String answer = "";

        if (isEven(num)) {
            answer = "yes";
        } else {
            answer = "no";
        }

        return new Pair<>(task, answer);
    }

    private static boolean isEven(int r) {
        return r % 2 == 0;
    }
}
