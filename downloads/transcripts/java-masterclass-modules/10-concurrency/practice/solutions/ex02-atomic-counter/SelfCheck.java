public class SelfCheck {
    public static void main(String[] args) throws Exception {
        int actual = Main.count(8, 10_000);
        if (actual != 80_000) throw new AssertionError(actual);
        System.out.println("PASS");
    }
}
