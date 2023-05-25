package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner game = new Scanner(System.in);
        int gameChoice = game.nextInt();

        switch (gameChoice) {
            case 0 -> game.close();

            case 1 -> {
                Greeting.hello();
                game.close();
            }

            case 2 -> Even.numberEvenOrNot();

            default -> game.close();
        }
    }
}
