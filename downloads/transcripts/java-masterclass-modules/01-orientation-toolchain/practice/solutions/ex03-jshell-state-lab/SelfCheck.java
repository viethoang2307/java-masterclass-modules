public class SelfCheck {
    public static void main(String[] args) {
        String expected = "JShell keeps snippet state until /reset or session exit";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX03");
    }
}

