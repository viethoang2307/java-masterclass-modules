public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Main.dayOfWeek(1).equals("Monday"), "one");
        check(Main.dayOfWeek(4).equals("Thursday"), "four");
        check(Main.dayOfWeek(7).equals("Sunday"), "seven");
        check(Main.dayOfWeek(0).equals("Invalid day"), "zero");
        check(Main.dayOfWeek(8).equals("Invalid day"), "eight");
        System.out.println("PASS");
    }
}

