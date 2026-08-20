public class SelfCheck {
    public static void main(String[] args) throws Exception {
        if (!Main.wasInterrupted()) throw new AssertionError();
        System.out.println("PASS");
    }
}
