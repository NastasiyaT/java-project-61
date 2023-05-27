package hexlet.code.games;

import hexlet.code.*;
import java.util.Random;
import java.util.Scanner;

public class GCD {

    public static int commonDivisor(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        }
        return commonDivisor(n2 % n1, n1);
    }

    public static void getGCD() {
        UserName.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");

        int i = 0;

        while (i < 3) {
            Random item = new Random();
            int number1 = item.nextInt(100);
            int number2 = item.nextInt(100);
            int result = commonDivisor(number1, number2);

            System.out.println("Question: " + number1 + " " + number2);
            System.out.print("Answer: ");
            Scanner answer = new Scanner(System.in);
            int userAnswer = answer.nextInt();

            if (userAnswer == result) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + result + "'");
                System.out.println("Let's try again, " + UserName.getName() + "!");
                break;
            }
        }

        if (i == 3) {
            System.out.println("Congratulations!");
        }
    }
}
