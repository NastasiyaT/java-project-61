package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void equation() {
        Engine.greeting();
        System.out.println("What is the result of the expression?");

        int i = 0;

        while (i < 3) {
            Random item = new Random();
            int number1 = item.nextInt(100);
            int number2 = item.nextInt(100);
            int rightAnswer = 0;
            String operator;

            switch (item.nextInt(3)) {
                case 0 -> {
                    operator = " + ";
                    rightAnswer = number1 + number2;
                }
                case 1 -> {
                    operator = " - ";
                    rightAnswer = number1 - number2;
                }
                case 2 -> {
                    operator = " * ";
                    rightAnswer = number1 * number2;
                }
                default -> operator = " ? ";
            }

            System.out.println("Question: " + number1 + operator + number2);
            Engine.askAnswerNumber();
            int userAnswer = Engine.getAnswerNumber();

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
