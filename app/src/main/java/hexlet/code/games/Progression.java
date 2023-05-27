package hexlet.code.games;

import hexlet.code.*;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void guessNumber() {
        UserName.greeting();
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
            System.out.print("Your answer: ");
            Scanner answer = new Scanner(System.in);
            int userAnswer = answer.nextInt();

            int result = items[place];

            if (userAnswer == result) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + result + "'");
                System.out.println("Let's try again, " + UserName.getName() + "!");
                break;
            }

            if (i == 3) {
                System.out.println("Congratulations!");
            }
        }
    }
}
