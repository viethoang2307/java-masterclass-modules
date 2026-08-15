public class SelfCheck {
    public static void main(String[] args) {
        String expected = "compile with --release 17 to enforce Java 17 API and language compatibility";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX06");
    }
}

