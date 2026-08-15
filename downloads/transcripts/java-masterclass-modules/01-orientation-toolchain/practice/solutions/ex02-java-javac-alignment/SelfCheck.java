public class SelfCheck {
    public static void main(String[] args) {
        String expected = "java-major == javac-major; paths belong to intended JDK";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX02");
    }
}

