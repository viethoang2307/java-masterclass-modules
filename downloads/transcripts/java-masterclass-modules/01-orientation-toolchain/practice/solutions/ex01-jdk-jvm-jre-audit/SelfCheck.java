public class SelfCheck {
    public static void main(String[] args) {
        String expected = "JDK=compile+tools; JVM=execute-bytecode; runtime=run+libraries";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX01");
    }
}

