import java.util.List;

public class SelfCheck {
    public static void main(String[] args) {
        var bad = List.of(new Main.Operation("load", false, false, true), new Main.Operation("save", true, true, false));
        check(Main.violations(bad).equals(List.of("unsafe-sql:load", "leaked-resource:load", "leaked-error:save")));
        check(Main.violations(List.of(new Main.Operation("ok", true, true, true))).isEmpty());
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
