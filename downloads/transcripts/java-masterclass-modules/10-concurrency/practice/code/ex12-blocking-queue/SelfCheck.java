public class SelfCheck {
    public static void main(String[] args) throws Exception {
        if (Main.sum() != 5_050) throw new AssertionError();
        System.out.println("PASS");
    }
}
