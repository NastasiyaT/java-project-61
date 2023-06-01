package hexlet.code.games;

import java.util.Random;

public class Even {
    public static void printQuestionEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static String[][] getQuestionAnswerEven() {
        final int round = 3;
        int questionAnswer = 2;
        String[][] items = new String[round][questionAnswer];

        for (int i = 0; i < round; i++) {
            Random newNumber = new Random();
            final int boundary100 = 100;
            int number = newNumber.nextInt(boundary100);

            items[i][0] = Integer.toString(number);

            if (number % 2 == 0) {
                items[i][1] = "yes";
            } else {
                items[i][1] = "no";
            }
        }

        return items;
    }
}
