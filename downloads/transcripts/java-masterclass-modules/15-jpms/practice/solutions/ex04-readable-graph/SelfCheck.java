import java.util.Map;
import java.util.Set;

public class SelfCheck {
    public static void main(String[] args) {
        Map<String, Set<String>> graph = Map.of("app", Set.of("service"), "service", Set.of("common"), "common", Set.of("app"));
        check(Main.canRead(graph, "app", "common"));
        check(Main.canRead(graph, "app", "app"));
        check(!Main.canRead(graph, "common", "missing"));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
