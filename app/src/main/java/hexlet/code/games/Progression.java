package hexlet.code.games;

import hexlet.code.*;
import java.util.Random;

public class Progression {
    public static int[] getNewArray() {
        Random count = new Random();

        int itemsCount = count.nextInt(6) + 5;
        int[] items = new int[itemsCount];

        int seed = count.nextInt(50);
        int step = count.nextInt(15) + 1;

        for (int n = 0; n < itemsCount; n++) {
            items[n] = seed;
            seed += step;
        }

        return items;
    }

    public static void guessNumber() {
        Engine.greeting();
        System.out.println("What number is missing in the progression?");

        int i = 0;

        while (i < 3) {
            Random number = new Random();
            int[] terms = getNewArray();

            int place = number.nextInt(terms.length);

            System.out.print("Question: ");
            for (int j = 0; j < place; j++) {
                System.out.print(terms[j] + " ");
            }
            System.out.print(".. ");
            for (int k = place + 1; k < terms.length; k++) {
                System.out.print(terms[k] + " ");
            }
            System.out.println();
            Engine.askAnswerNumber();
            int userAnswer = Engine.getAnswerNumber();

            int rightAnswer = terms[place];

            Engine.reactionNumber(userAnswer, rightAnswer);

            if (userAnswer == rightAnswer) {
                i++;
            } else {
                i = 4;
            }
        }

        Engine.congratulation(i);
    }
}
