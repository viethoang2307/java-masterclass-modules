public class SelfCheck {
    public static void main(String[] args) {
        String expected = "fix the first causal diagnostic, recompile, then reassess";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX15");
    }
}

