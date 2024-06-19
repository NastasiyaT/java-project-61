package hexlet.code;

import java.util.Objects;
import java.util.Scanner;

import static hexlet.code.Utils.*;

public class App {

    public static void main(String[] args) {

        printGameChoice();
        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();

        try {
            Option option = null;
            for (Option n : Option.values()) {
                if (userChoice == n.getNumber()) {
                    option = n;
                }
            }

            switch (Objects.requireNonNull(option)) {

                case Exit -> input.close();

                case Greet -> printWelcomeMessage();

                default -> {
                    printWelcomeMessage();
                    Engine.playGame(option);
                }
            }
        } catch (Exception e) {
            System.out.println("No such game exists!");
        }
    }
}
