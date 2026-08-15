public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Main.formatDuration(0).equals("0m 0s"), "zero");
        check(Main.formatDuration(61).equals("1m 1s"), "61");
        check(Main.formatDuration(3600).equals("60m 0s"), "hour");
        check(Main.formatDuration(1, 5).equals("1m 5s"), "overload");
        check(Main.formatDuration(1, 60).equals("Invalid value"), "seconds range");
        check(Main.formatDuration(-1).equals("Invalid value"), "negative");
        System.out.println("PASS");
    }
}

