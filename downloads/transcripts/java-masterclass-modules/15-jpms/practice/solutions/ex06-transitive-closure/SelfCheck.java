import java.util.Map;
import java.util.Set;

public class SelfCheck {
    public static void main(String[] args) {
        Map<String, Set<String>> g = Map.of("app", Set.of("db", "ui"), "db", Set.of("common"), "ui", Set.of("common"), "common", Set.of("app"));
        check(Main.readableModules(g, "app").equals(Set.of("app", "db", "ui", "common")));
        check(Main.readableModules(g, "missing").equals(Set.of("missing")));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
