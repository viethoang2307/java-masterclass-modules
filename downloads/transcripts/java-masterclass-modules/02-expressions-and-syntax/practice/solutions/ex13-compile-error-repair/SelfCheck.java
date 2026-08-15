public class SelfCheck {
    public static void main(String[] args) {
        if (!"Java:50003".equals(Main.repaired())) throw new AssertionError(Main.repaired());
        System.out.println("PASS - EX13");
    }
}

