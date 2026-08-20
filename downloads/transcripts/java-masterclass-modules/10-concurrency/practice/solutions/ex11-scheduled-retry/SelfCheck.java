public class SelfCheck {
    public static void main(String[] args) throws Exception {
        if (Main.attempts() != 3) throw new AssertionError();
        System.out.println("PASS");
    }
}
