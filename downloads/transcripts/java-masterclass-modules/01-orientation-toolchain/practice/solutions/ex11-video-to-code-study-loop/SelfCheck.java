public class SelfCheck {
    public static void main(String[] args) {
        String expected = "watch small chunk -> type -> predict -> run -> explain -> review";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX11");
    }
}

