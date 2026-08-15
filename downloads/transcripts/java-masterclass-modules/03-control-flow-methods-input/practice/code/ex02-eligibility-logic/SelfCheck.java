public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Main.canEnter(20, true, false), "adult with id");
        check(!Main.canEnter(20, false, false), "missing id");
        check(Main.canEnter(15, false, true), "vip");
        check(!Main.canEnter(-1, true, true), "negative age");
        check(!Main.canEnter(17, true, false), "minor");
        System.out.println("PASS");
    }
}

