public class SelfCheck {
    public static void main(String[] args) throws Exception {
        if (!"A+B+C".equals(Main.combine())) throw new AssertionError();
        System.out.println("PASS");
    }
}
