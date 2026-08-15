public class SelfCheck {
    public static void main(String[] args) {
        String expected = "share verification goals; isolate OS-specific installation and shell commands";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX17");
    }
}

