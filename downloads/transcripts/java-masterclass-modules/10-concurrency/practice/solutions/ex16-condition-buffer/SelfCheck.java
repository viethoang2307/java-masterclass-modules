public class SelfCheck {
    public static void main(String[] args) throws Exception {
        if (Main.roundTrip() != 210) throw new AssertionError();
        System.out.println("PASS");
    }
}
