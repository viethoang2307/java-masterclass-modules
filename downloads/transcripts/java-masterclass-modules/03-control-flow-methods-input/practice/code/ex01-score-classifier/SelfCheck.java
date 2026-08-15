public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Main.classify(-1).equals("INVALID"), "negative");
        check(Main.classify(0).equals("FAIL"), "zero");
        check(Main.classify(49).equals("FAIL"), "49");
        check(Main.classify(50).equals("PASS"), "50");
        check(Main.classify(79).equals("PASS"), "79");
        check(Main.classify(80).equals("DISTINCTION"), "80");
        check(Main.classify(100).equals("DISTINCTION"), "100");
        check(Main.classify(101).equals("INVALID"), "over 100");
        System.out.println("PASS");
    }
}

