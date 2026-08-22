import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    record Requirement(String id, boolean complete) {}
    record Project(Map<String, Set<String>> dependencies, List<Requirement> requirements, List<String> trackIds, Set<String> requiredModules, Set<String> runtimeModules) {}

    static List<String> audit(Project project) {
        // TODO: integrate requirements, domain IDs, dependency cycles, and runtime module checks.
        return List.of();
    }
}
