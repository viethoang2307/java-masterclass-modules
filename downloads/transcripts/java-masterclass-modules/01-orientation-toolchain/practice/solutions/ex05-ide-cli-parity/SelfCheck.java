public class SelfCheck {
    public static void main(String[] args) {
        String expected = "IDE and CLI must use compatible JDK, source and inputs";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX05");
    }
}

