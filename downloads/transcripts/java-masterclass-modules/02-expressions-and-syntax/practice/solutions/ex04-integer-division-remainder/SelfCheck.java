public class SelfCheck {
    public static void main(String[] args) {
        if (!"Int=2;Remainder=1;Double=2.5".equals(Main.result())) {
            throw new AssertionError("Division mismatch");
        }
        System.out.println("PASS - EX04");
    }
}

