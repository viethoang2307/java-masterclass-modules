public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Main.sumInclusive(1, 5) == 15, "one to five");
        check(Main.sumInclusive(5, 5) == 5, "single");
        check(Main.sumInclusive(5, 1) == 0, "reverse");
        check(Main.sumInclusive(-2, 2) == 0, "negative range");
        check(Main.sumInclusive(1, 100000) == 5000050000L, "large");
        System.out.println("PASS");
    }
}

