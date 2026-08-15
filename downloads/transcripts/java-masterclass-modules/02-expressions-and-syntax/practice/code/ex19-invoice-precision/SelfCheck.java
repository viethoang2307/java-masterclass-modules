public class SelfCheck {
    public static void main(String[] args) {
        String expected = "subtotal=59.97;tax=5.9970;total=65.9670";
        if (!expected.equals(Main.result())) throw new AssertionError(Main.result());
        System.out.println("PASS - EX19");
    }
}

