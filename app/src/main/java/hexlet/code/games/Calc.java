package hexlet.code.games;

import hexlet.code.*;
import java.util.Random;

public class Calc {
    public static void equation() {
        UserName.greeting();
        System.out.println("What is the result of the expression?");

        int i = 0;

        while (i < 3) {
            Random item = new Random();
            int number1 = item.nextInt(100);
            int number2 = item.nextInt(100);
            int result = 0;
            String operator = " ? ";

            switch (item.nextInt(3)) {
                case 0 -> {
                    operator = " + ";
                    result = number1 + number2;
                }
                case 1 -> {
                    operator = " - ";
                    result = number1 - number2;
                }
                case 2 -> {
                    operator = " * ";
                    result = number1 * number2;
                }
                default -> operator = " ? ";
            }

            System.out.println("Question: " + number1 + operator + number2);
            UserName.askAnswer();
            int userAnswer = UserName.getAnswer();

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
