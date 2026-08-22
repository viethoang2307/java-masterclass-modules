public class SelfCheck {
    public static void main(String[] args) {
        if (!"7:a@example.com".equals(Main.roundTrip())) throw new AssertionError();
        System.out.println("PASS");
    }
}
