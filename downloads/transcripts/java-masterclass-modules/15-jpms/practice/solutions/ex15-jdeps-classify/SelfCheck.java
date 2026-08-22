public class SelfCheck {
    public static void main(String[] args) {
        check(Main.directive(true, true).equals("requires transitive"));
        check(Main.directive(true, false).equals("requires transitive"));
        check(Main.directive(false, true).equals("requires"));
        check(Main.directive(false, false).equals("requires static"));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
