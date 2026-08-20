import java.util.Map;
import java.util.Set;

public class SelfCheck {
    public static void main(String[] args) {
        var deps = Map.of("ui", Set.of("application"), "application", Set.of("domain"), "domain", Set.of("jdbc"), "infrastructure", Set.of("ui"));
        check(Main.violations(deps).equals(java.util.List.of("domain->jdbc", "infrastructure->ui")));
        check(Main.violations(Map.of("ui", Set.of("port"))).isEmpty());
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
