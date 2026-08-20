public class SelfCheck {
    public static void main(String[] args) {
        check(Main.userCode("input").equals("INVALID_INPUT"));
        check(Main.userCode("infrastructure").equals("UNAVAILABLE"));
        check(Main.userCode("sql-exception").equals("INTERNAL_ERROR"));
        check(Main.userCode(null).equals("INTERNAL_ERROR"));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
