public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.describe(new Main.Success("done")).equals("OK:done"), "success");
        check(Main.describe(new Main.Failure("bad")).equals("ERROR:bad"), "failure");
        System.out.println("PASS");
    }
}

