public class SelfCheck {
    public static void main(String[] args) {
        String expected = "install -> configure -> verify versions -> compile -> run -> record evidence";
        String actual = Main.answer();
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " | Actual: " + actual);
        }
        System.out.println("PASS - EX09");
    }
}

