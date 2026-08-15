public class SelfCheck {
    public static void main(String[] args) {
        String expected = "PATH selects executable; JAVA_HOME does not override command resolution by itself";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX07");
    }
}

