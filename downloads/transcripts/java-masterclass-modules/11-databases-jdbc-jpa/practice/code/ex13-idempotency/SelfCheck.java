public class SelfCheck {
    public static void main(String[] args) {
        if (Main.applyTwice() != 150) throw new AssertionError();
        System.out.println("PASS");
    }
}
