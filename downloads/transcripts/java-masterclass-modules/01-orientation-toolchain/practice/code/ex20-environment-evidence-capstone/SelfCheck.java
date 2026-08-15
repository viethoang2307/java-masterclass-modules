public class SelfCheck {
    public static void main(String[] args) {
        String expected = "evidence must prove toolchain, workflow, reproducibility and support readiness";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX20");
    }
}

