public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Main.parseScore("80") == 80, "normal");
        check(Main.parseScore(" 0 ") == 0, "zero");
        check(Main.parseScore("100") == 100, "max");
        check(Main.parseScore("101") == null, "range");
        check(Main.parseScore("abc") == null, "text");
        check(Main.parseScore("   ") == null, "blank");
        check(Main.parseScore(null) == null, "null");
        System.out.println("PASS");
    }
}

