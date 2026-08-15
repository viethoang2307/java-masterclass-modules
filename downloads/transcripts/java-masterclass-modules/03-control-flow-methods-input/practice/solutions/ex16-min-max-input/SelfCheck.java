public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Main.summarize("-5 x 10 3").equals("count=3;min=-5;max=10"), "mixed");
        check(Main.summarize("5 5 5").equals("count=3;min=5;max=5"), "same");
        check(Main.summarize("-8 -2 -20").equals("count=3;min=-20;max=-2"), "negative");
        check(Main.summarize("x y").equals("count=0"), "none");
        check(Main.summarize(null).equals("count=0"), "null");
        System.out.println("PASS");
    }
}

