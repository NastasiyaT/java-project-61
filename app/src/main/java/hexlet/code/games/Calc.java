package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static final int ROUND = 3;

    public static void getEquation() {
        String[][] issues = new String[ROUND][2];

        for (String[] issue : issues) {
            String[] reactions = generateRoundData();
            issue[0] = reactions[0];
            issue[1] = reactions[1];
        }

        String task = "What is the result of the expression?";

        Engine.playGame(task, issues);
    }

    public static final int BOUNDARY = 100;

    public static String[] generateRoundData() {
        String[] items = {"Question", "Answer"};

        Random newNumber = new Random();

        int n1 = newNumber.nextInt(BOUNDARY);
        int n2 = newNumber.nextInt(BOUNDARY);
        String[] operators = {" + ", " - ", " * "};

        switch (newNumber.nextInt(operators.length)) {
            case 0 -> {
                items[0] = n1 + operators[0] + n2;
                items[1] = Integer.toString(n1 + n2);
            }
            case 1 -> {
                items[0] = n1 + operators[1] + n2;
                items[1] = Integer.toString(n1 - n2);
            }
            case 2 -> {
                items[0] = n1 + operators[2] + n2;
                items[1] = Integer.toString(n1 * n2);
            }
            default -> throw new Error("Unknown operator!");
        }

        return items;
    }
}
