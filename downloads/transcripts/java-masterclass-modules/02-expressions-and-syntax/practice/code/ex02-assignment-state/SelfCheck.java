public class SelfCheck {
    public static void main(String[] args) {
        if (!"Start=10;End=15".equals(Main.result())) {
            throw new AssertionError("Assignment state mismatch");
        }
        System.out.println("PASS - EX02");
    }
}

