import java.util.List;
import java.util.Map;
import java.util.Set;

public class SelfCheck {
    public static void main(String[] args) {
        var good = new Main.Project(Map.of("app", Set.of("domain"), "domain", Set.<String>of()), List.of(new Main.Requirement("US-1", true)), List.of("t1", "t2"), Set.of("java.base", "app"), Set.of("java.base", "app"));
        check(Main.audit(good).isEmpty());
        var bad = new Main.Project(Map.of("app", Set.of("domain"), "domain", Set.of("app")), List.of(new Main.Requirement("US-2", false)), List.of("t1", " t1 "), Set.of("app", "db"), Set.of("app"));
        check(Main.audit(bad).equals(List.of("requirement:US-2", "duplicate-track: t1 ", "dependency-cycle", "missing-runtime:db")));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
