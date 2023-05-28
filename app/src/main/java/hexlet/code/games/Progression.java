package hexlet.code.games;

import hexlet.code.*;
import java.util.Random;

public class Progression {
    public static void guessNumber() {
        Engine.greeting();
        System.out.println("What number is missing in the progression?");

        int i = 0;

        while (i < 3) {
            Random number = new Random();
            int low = 5;
            int high = 10;
            int itemsCount = number.nextInt(high - low) + low;
            int[] items = new int[itemsCount];

            int seed = number.nextInt(50);
            int step = number.nextInt(15) + 1;

            for (int n = 0; n < itemsCount; n++) {
                items[n] = seed;
                seed += step;
            }

            int place = number.nextInt(itemsCount);

            System.out.print("Question: ");
            for (int j = 0; j < place; j++) {
                System.out.print(items[j] + " ");
            }
            System.out.print(".. ");
            for (int k = place + 1; k < itemsCount; k++) {
                System.out.print(items[k] + " ");
            }
            System.out.println();
            Engine.askAnswerNumber();
            int userAnswer = Engine.getAnswerNumber();

            int rightAnswer = items[place];

            Engine.reaction(userAnswer, rightAnswer);

            if (userAnswer == rightAnswer) {
                i++;
            } else {
                i = 4;
            }
        }

        Engine.congratulation(i);
    }
}
