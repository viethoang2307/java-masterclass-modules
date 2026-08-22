import java.util.List;

public class SelfCheck {
    public static void main(String[] args) {
        var checks = List.of(new Main.Check("tests", true, 5), new Main.Check("rollback", false, 3));
        check(Main.score(checks) == 5);
        check(Main.status(checks).equals("NOT_READY"));
        check(Main.status(List.of(new Main.Check("all", true, 1))).equals("READY"));
        try { Main.score(List.of(new Main.Check("bad", true, -1))); throw new AssertionError(); } catch (IllegalArgumentException expected) { }
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
