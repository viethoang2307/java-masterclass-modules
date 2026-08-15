public class SelfCheck {
    public static void main(String[] args) {
        String expected = "preserve evidence -> isolate layer -> verify fix -> document rollback";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX18");
    }
}

