public class SelfCheck {
    public static void main(String[] args) {
        String expected = "source -> javac -> bytecode -> java launcher -> JVM";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX04");
    }
}

