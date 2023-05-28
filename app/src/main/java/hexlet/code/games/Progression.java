package hexlet.code.games;

import hexlet.code.Engine;
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

    public static void printArray(int[] cases, int dot) {
        System.out.print("Question: ");
        for (int j = 0; j < dot; j++) {
            System.out.print(cases[j] + " ");
        }
        System.out.print(".. ");
        for (int k = dot + 1; k < cases.length; k++) {
            System.out.print(cases[k] + " ");
        }
        System.out.println();
    }

    public static void guessNumber() {
        Engine.greeting();
        System.out.println("What number is missing in the progression?");

        int i = 0;

        while (i < 3) {
            Random number = new Random();
            int[] terms = getNewArray();
            int place = number.nextInt(terms.length);
            printArray(terms, place);

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
