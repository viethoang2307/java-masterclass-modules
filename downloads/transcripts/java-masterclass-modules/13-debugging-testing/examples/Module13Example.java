public class Module13Example {
    static int parsePositive(String text) {
        int value = Integer.parseInt(text);
        if (value <= 0) throw new IllegalArgumentException("must be positive");
        return value;
    }
    static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(parsePositive("7") == 7, "positive parse");
        boolean failed = false;
        try { parsePositive("-1"); }
        catch (IllegalArgumentException expected) { failed = true; }
        check(failed, "negative input must fail");
        System.out.println("PASS");
    }
}