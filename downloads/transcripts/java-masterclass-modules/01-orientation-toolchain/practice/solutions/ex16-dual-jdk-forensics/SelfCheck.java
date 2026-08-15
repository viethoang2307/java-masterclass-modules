public class SelfCheck {
    public static void main(String[] args) {
        String expected = "inventory every resolution path before changing PATH or IDE settings";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX16");
    }
}

