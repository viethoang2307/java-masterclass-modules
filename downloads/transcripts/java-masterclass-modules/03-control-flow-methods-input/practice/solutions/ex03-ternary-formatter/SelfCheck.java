public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Main.formatLabel("An", 80).equals("An: PASS"), "normal");
        check(Main.formatLabel("  An  ", 49).equals("An: FAIL"), "trim");
        check(Main.formatLabel(null, 50).equals("Guest: PASS"), "null");
        check(Main.formatLabel("   ", 0).equals("Guest: FAIL"), "blank");
        System.out.println("PASS");
    }
}

