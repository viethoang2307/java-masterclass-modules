public class SelfCheck {
    public static void main(String[] args) {
        check(Main.outcome(true, true, true, false).equals("committed"));
        check(Main.outcome(true, false, false, true).equals("rolled-back"));
        check(Main.outcome(true, false, false, false).equals("rollback-failed"));
        check(Main.outcome(false, false, false, true).equals("not-started"));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
