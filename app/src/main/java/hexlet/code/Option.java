package hexlet.code;

public enum Option {
    Greet(1), Even(2), Calc(3), GCD(4), Progression(5), Prime(6), Exit(0);

    private final int number;

    Option(int i) {
        this.number = i;
    }

    public int getNumber() {
        return this.number;
    }
}
