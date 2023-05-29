package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static int[] getNewArray() {
        Random count = new Random();
        int max = 10;
        int min = 5;
        int itemsCount = count.nextInt(max - min) + min;
        int[] items = new int[itemsCount];

        int startNumberMaximum = 50;
        int seed = count.nextInt(startNumberMaximum);

        int stepMaximum = 15;
        int step = count.nextInt(stepMaximum) + 1;

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
        int round = Engine.getRoundCount();

        while (i < round) {
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
                i = round + 1;
            }
        }

        Engine.congratulation(i, round);
    }
}
