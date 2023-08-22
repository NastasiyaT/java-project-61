package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int BOUNDARY = 100;

    public static final String QUESTION = "question";
    public static final String ANSWER = "answer";

    public static int getNewRandomNumber(int edge) {
        Random newNumber = new Random();
        return newNumber.nextInt(edge);
    }
}
