public class SelfCheck {
    public static void main(String[] args) {
        if (!"wrapper=Integer;sum=30".equals(Main.result())) throw new AssertionError(Main.result());
        System.out.println("PASS - EX07");
    }
}

