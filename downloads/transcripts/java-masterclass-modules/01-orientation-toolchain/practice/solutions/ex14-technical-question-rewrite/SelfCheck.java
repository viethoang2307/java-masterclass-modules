public class SelfCheck {
    public static void main(String[] args) {
        String expected = "specific goal + minimal code + exact error + environment + attempted fixes";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX14");
    }
}

