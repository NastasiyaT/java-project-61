package hexlet.code.games;

import hexlet.code.Utils;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.Map;
import java.util.Random;

public final class Calc implements Game {
    public static final String CALC_NAME = "Calc";

    @Override
    public void printTask() {
        System.out.println("What is the result of the expression?");
    }

    @Override
    public Map<String, String> getAssignment() {
        int num1 = Utils.getNewRandomNumber(Utils.BOUNDARY);
        int num2 = Utils.getNewRandomNumber(Utils.BOUNDARY);

        String operator = generateOperator();

        String task = num1 + " " + operator + " " + num2;

        Expression expression = new ExpressionBuilder(task).build();
        int result = (int) expression.evaluate();

        String answer = String.valueOf(result);

        return Map.of(Utils.QUESTION, task,
                Utils.ANSWER, answer);
    }

    private static String generateOperator() {
        String[] operators = {"+", "-", "*"};
        Random indicator = new Random();
        int num = indicator.nextInt(operators.length);
        return operators[num];
    }
}
