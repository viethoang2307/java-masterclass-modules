public class SelfCheck {
    public static void main(String[] args) {
        String expected = "choose baseline by compatibility and support policy, not newest-version bias";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX10");
    }
}

