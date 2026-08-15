public class SelfCheck {
    public static void main(String[] args) {
        if (!"Without=16;With=36".equals(Main.result())) {
            throw new AssertionError("Precedence mismatch");
        }
        System.out.println("PASS - EX03");
    }
}

