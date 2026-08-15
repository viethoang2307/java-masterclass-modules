public class SelfCheck {
    public static void main(String[] args) {
        String expected = "minimal code + exact commands + expected/actual + environment";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX13");
    }
}

