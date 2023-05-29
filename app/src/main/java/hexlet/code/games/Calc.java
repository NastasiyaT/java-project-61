package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void equation() {
        Engine.greeting();
        System.out.println("What is the result of the expression?");

        int i = 0;
        int round = Engine.getRoundCount();

        while (i < round) {
            Random item = new Random();
            int boundary = Engine.getRandomBoundary();

            int number1 = item.nextInt(boundary);
            int number2 = item.nextInt(boundary);

            int rightAnswer;

            String[] operators = {" + ", " - ", " * "};
            String operator;

            switch (item.nextInt(operators.length)) {
                case 0 -> {
                    operator = operators[0];
                    rightAnswer = number1 + number2;
                }
                case 1 -> {
                    operator = operators[1];
                    rightAnswer = number1 - number2;
                }
                case 2 -> {
                    operator = operators[2];
                    rightAnswer = number1 * number2;
                }
                default -> {
                    operator = " ? ";
                    rightAnswer = 0;
                }
            }

            System.out.println("Question: " + number1 + operator + number2);
            Engine.askAnswerNumber();
            int userAnswer = Engine.getAnswerNumber();

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
