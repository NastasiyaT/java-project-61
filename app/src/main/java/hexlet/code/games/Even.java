package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Map;

public final class Even implements Game {
    public static final String EVEN_NAME = "Even";

    @Override
    public void printTask() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    @Override
    public Map<String, String> getAssignment() {

        int num = Utils.getNewRandomNumber(Utils.BOUNDARY);

        String task = String.valueOf(num);
        String answer = "";

        if (isEven(num)) {
            answer = "yes";
        } else {
            answer = "no";
        }

        return Map.of(Utils.QUESTION, task,
                Utils.ANSWER, answer);
    }

    private static boolean isEven(int r) {
        return r % 2 == 0;
    }
}
