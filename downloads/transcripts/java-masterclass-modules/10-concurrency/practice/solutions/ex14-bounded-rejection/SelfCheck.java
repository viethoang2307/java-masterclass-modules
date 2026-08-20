public class SelfCheck {
    public static void main(String[] args) throws Exception {
        if (Main.rejections() != 1) throw new AssertionError();
        System.out.println("PASS");
    }
}
