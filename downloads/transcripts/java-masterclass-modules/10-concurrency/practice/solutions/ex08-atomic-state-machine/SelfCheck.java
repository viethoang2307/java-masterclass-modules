public class SelfCheck {
    public static void main(String[] args) throws Exception {
        if (!"STOPPED".equals(Main.finalState())) throw new AssertionError();
        System.out.println("PASS");
    }
}
