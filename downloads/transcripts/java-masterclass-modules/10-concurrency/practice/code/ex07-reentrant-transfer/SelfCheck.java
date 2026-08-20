public class SelfCheck {
    public static void main(String[] args) throws Exception {
        if (Main.totalAfterTransfers() != 2_000) throw new AssertionError();
        System.out.println("PASS");
    }
}
