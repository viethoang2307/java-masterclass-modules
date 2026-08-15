public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Main.runBoundaryChecks() == 8, "all boundary cases");
        check(Main.classify(49).equals("FAIL"), "49");
        check(Main.classify(50).equals("PASS"), "50");
        check(Main.classify(79).equals("PASS"), "79");
        check(Main.classify(80).equals("DISTINCTION"), "80");
        System.out.println("PASS");
    }
}

