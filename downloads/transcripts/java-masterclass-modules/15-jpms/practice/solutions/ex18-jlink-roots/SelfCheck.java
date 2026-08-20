import java.util.Map;
import java.util.Set;

public class SelfCheck {
    public static void main(String[] args) {
        Map<String, Set<String>> graph = Map.of("app", Set.of("common", "provider"), "provider", Set.of("api"), "common", Set.of("api"), "api", Set.<String>of());
        check(Main.imageModules(graph, Set.of("app")).equals(Set.of("app", "common", "provider", "api")));
        check(Main.imageModules(graph, Set.of("common")).equals(Set.of("common", "api")));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
