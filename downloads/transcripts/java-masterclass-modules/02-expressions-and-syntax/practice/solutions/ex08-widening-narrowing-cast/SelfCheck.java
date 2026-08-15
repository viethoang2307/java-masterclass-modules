public class SelfCheck {
    public static void main(String[] args) {
        if (!"widened=100;narrowed=-126".equals(Main.result())) throw new AssertionError(Main.result());
        System.out.println("PASS - EX08");
    }
}

