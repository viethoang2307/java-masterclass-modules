public class SelfCheck {
    public static void main(String[] args) {
        if (!"money=0.30".equals(Main.result())) throw new AssertionError(Main.result());
        System.out.println("PASS - EX16");
    }
}

