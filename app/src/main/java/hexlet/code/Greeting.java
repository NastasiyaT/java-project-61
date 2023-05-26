package hexlet.code;

public class Greeting {
    public static void hello() {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        UserName.receiveName();
        String name = UserName.getName();

        System.out.println("Hello, " + name + "!");
    }
}
