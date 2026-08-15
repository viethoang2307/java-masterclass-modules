public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.report(new Main.Phone(),new Main.Lamp()).equals("phone:charge,track|lamp:charge"),"capabilities");
        check(Main.report().equals(""),"empty");
        System.out.println("PASS");
    }
}

