public class SelfCheck {
    public static void main(String[] args) {
        String expected = "Project SDK, language level, module SDK and run target must agree";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX08");
    }
}

