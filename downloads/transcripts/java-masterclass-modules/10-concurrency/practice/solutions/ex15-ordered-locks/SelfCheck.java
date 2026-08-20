public class SelfCheck {
    public static void main(String[] args) throws Exception {
        if (!Main.completes()) throw new AssertionError();
        System.out.println("PASS");
    }
}
