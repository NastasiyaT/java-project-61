package hexlet.code;

import java.util.List;
import java.util.Scanner;

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
                    System.out.println("\nWelcome to the Brain Games!");
                    System.out.println("May I have your name? ");
                    String name = input.next();
                    System.out.println("Hello, " + name + "!");
                }

                default -> Engine.playGame(gameName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printGameChoice() {
        System.out.println("Please enter the game number and press Enter");

        for (int i = 1; i < optionsNumber; i++) {
            String option = options.get(i);
            System.out.println(i + " - " + option);
        }
        System.out.println("0 - " + options.get(0));
        System.out.print("Your choice: ");
    }
}
