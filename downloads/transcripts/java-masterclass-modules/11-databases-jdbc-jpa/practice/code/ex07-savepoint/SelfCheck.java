public class SelfCheck {
    public static void main(String[] args) {
        if (Main.apply(100, false) != 115 || Main.apply(100, true) != 110) throw new AssertionError();
        System.out.println("PASS");
    }
}
