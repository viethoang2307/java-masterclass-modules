import java.util.List;
import java.util.Map;
import java.util.Set;

public class SelfCheck {
    public static void main(String[] args) {
        var good = new Main.Project(Map.of("app", Set.of("service"), "service", Set.of("common")), Map.of("app", Set.of("com.acme.app"), "service", Set.of("com.acme.service"), "common", Set.of("com.acme.common")), "app", "service", Map.of("service", Set.of("provider")));
        check(Main.audit(good).isEmpty());
        var bad = new Main.Project(Map.of("app", Set.of("common")), Map.of("app", Set.of("com.acme.shared"), "common", Set.of("com.acme.shared")), "app", "service", Map.of());
        check(Main.audit(bad).equals(List.of("unreachable-service", "split-package:com.acme.shared", "missing-provider")));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
