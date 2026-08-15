public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Main.sumMultiples(10) == 23, "10");
        check(Main.sumMultiples(16) == 60, "16");
        check(Main.sumMultiples(1) == 0, "one");
        check(Main.sumMultiples(0) == 0, "zero");
        check(Main.sumMultiples(-4) == 0, "negative");
        System.out.println("PASS");
    }
}

