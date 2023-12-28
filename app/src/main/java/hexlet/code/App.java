package hexlet.code;

import java.util.List;
import java.util.Scanner;

import static hexlet.code.Engine.GREETING_MESSAGE;
import static hexlet.code.Engine.WELCOME_MESSAGE;

public class App {
    private static List<String> options = List.of(
            "Exit", "Greet", "Even", "Calc", "GCD", "Progression", "Prime"
    );

    private static int optionsNumber = options.size();

    public static void main(String[] args) {
        printGameChoice();

        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();

        try {
            String gameName = options.get(userChoice);

            switch (gameName) {
                case "Exit" -> input.close();

                case "Greet" -> {
                    System.out.println(WELCOME_MESSAGE);
                    System.out.println(GREETING_MESSAGE);
                    String name = input.next();
                    System.out.printf("Hello, %s!%n", name);
                }

                default -> Engine.playGame(gameName);
            }
        } catch (Exception e) {
            System.out.println("No such game exists!");
        }
    }

    private static void printGameChoice() {
        System.out.println("Please enter the game number and press Enter");

        for (int i = 1; i < optionsNumber; i++) {
            String option = options.get(i);
            System.out.printf("%d - %s%n", i, option);
        }
        System.out.printf("%d - %s%n", 0, options.get(0));
        System.out.print("Your choice: ");
    }
}
