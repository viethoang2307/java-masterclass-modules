public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Main.digitSum(1234) == 10, "sum");
        check(Main.digitSum(-99) == 18, "negative sum");
        check(Main.digitSum(0) == 0, "zero sum");
        check(Main.reverseDigits(1234) == 4321, "reverse");
        check(Main.reverseDigits(-120) == -21, "negative reverse");
        check(Main.reverseDigits(0) == 0, "zero reverse");
        System.out.println("PASS");
    }
}

