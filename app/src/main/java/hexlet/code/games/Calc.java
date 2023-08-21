package hexlet.code.games;

import hexlet.code.Utils;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.Random;

public final class Calc implements Game {
    public static final String CALC_NAME = "Calc";

    @Override
    public void printTask() {
        System.out.println("What is the result of the expression?");
    }

    @Override
    public String getQuestion() {
        int num1 = Utils.getNewRandomNumber(Utils.BOUNDARY);
        int num2 = Utils.getNewRandomNumber(Utils.BOUNDARY);

        String operator = generateOperator();

        return num1 + " " + operator + " " + num2;
    }

    @Override
    public String getAnswer(String question) {
        Expression expression = new ExpressionBuilder(question).build();
        int result = (int) expression.evaluate();
        return String.valueOf(result);
    }

    private static String generateOperator() {
        String[] operators = {"+", "-", "*"};
        Random indicator = new Random();
        int num = indicator.nextInt(operators.length);
        return operators[num];
    }
}
