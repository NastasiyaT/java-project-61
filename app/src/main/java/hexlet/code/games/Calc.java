package hexlet.code.games;

import java.util.Random;

public class Calc {
    public static void printQuestionCalc() {
        System.out.println("What is the result of the expression?");
    }

    public static String[][] getQuestionAnswerCalc() {
        int round = 3;
        int questionAnswer = 2;
        String[][] items = new String[round][questionAnswer];

        for (int i = 0; i < round; i++) {
            Random newNumber = new Random();
            final int BOUNDARY100 = 100;

            int number1 = newNumber.nextInt(BOUNDARY100);
            int number2 = newNumber.nextInt(BOUNDARY100);
            String[] operators = {" + ", " - ", " * "};

            switch (newNumber.nextInt(operators.length)) {
                case 0 -> {
                    items[i][0] = number1 + operators[0] + number2;
                    items[i][1] = Integer.toString(number1 + number2);
                }
                case 1 -> {
                    items[i][0] = number1 + operators[1] + number2;
                    items[i][1] = Integer.toString(number1 - number2);
                }
                case 2 -> {
                    items[i][0] = number1 + operators[2] + number2;
                    items[i][1] = Integer.toString(number1 * number2);
                }
                default -> {
                    items[i][0] = "?";
                    items[i][1] = Integer.toString(0);
                }
            }
        }

        return items;
    }
}