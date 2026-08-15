public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Main.calculateHighScorePosition(-1) == 0, "negative");
        check(Main.calculateHighScorePosition(0) == 4, "zero");
        check(Main.calculateHighScorePosition(99) == 4, "99");
        check(Main.calculateHighScorePosition(100) == 3, "100");
        check(Main.calculateHighScorePosition(499) == 3, "499");
        check(Main.calculateHighScorePosition(500) == 2, "500");
        check(Main.calculateHighScorePosition(999) == 2, "999");
        check(Main.calculateHighScorePosition(1000) == 1, "1000");
        System.out.println("PASS");
    }
}

