package hexlet.code.games;

import hexlet.code.Utils;

public final class Even implements Game {
    public static final String EVEN_NAME = "Even";

    @Override
    public void printTask() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    @Override
    public String getQuestion() {
        int num = Utils.getNewRandomNumber(Utils.BOUNDARY);
        return Integer.toString(num);
    }

    @Override
    public String getAnswer(String question) {
        int val = Integer.parseInt(question);

        if (isEven(val)) {
            return "yes";
        } else {
            return "no";
        }
    }

    private static boolean isEven(int r) {
        return r % 2 == 0;
    }
}
