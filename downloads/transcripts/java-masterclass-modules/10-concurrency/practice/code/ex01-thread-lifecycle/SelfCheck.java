public class SelfCheck {
    public static void main(String[] args) throws Exception {
        if (!"worker-done".equals(Main.run())) throw new AssertionError();
        System.out.println("PASS");
    }
}
