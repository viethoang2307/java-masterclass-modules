public class SelfCheck {
    public static void main(String[] args) throws Exception {
        if (Main.finalBalance() != 80_000) throw new AssertionError();
        System.out.println("PASS");
    }
}
