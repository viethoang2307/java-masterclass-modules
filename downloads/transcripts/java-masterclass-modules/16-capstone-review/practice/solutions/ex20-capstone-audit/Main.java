import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    record Requirement(String id, boolean complete) {}
    record Project(Map<String, Set<String>> dependencies, List<Requirement> requirements, List<String> trackIds, Set<String> requiredModules, Set<String> runtimeModules) {}

    static List<String> audit(Project project) {
        if (project == null) return List.of("invalid-project");
        List<String> result = new ArrayList<>();
        if (project.requirements() != null) for (Requirement requirement : project.requirements()) if (requirement == null || requirement.id() == null || !requirement.complete()) result.add("requirement:" + (requirement == null ? "null" : requirement.id()));
        Set<String> seen = new HashSet<>();
        if (project.trackIds() != null) for (String id : project.trackIds()) if (id == null || id.isBlank() || !seen.add(id.trim())) result.add("duplicate-track:" + id);
        if (hasCycle(project.dependencies())) result.add("dependency-cycle");
        if (project.requiredModules() != null) for (String module : project.requiredModules()) if (project.runtimeModules() == null || !project.runtimeModules().contains(module)) result.add("missing-runtime:" + module);
        return result;
    }

    private static boolean hasCycle(Map<String, Set<String>> graph) {
        Set<String> visiting = new HashSet<>();
        Set<String> done = new HashSet<>();
        if (graph == null) return false;
        for (String node : graph.keySet()) if (cycle(node, graph, visiting, done)) return true;
        return false;
    }

    private static boolean cycle(String node, Map<String, Set<String>> graph, Set<String> visiting, Set<String> done) {
        if (done.contains(node)) return false;
        if (!visiting.add(node)) return true;
        for (String dependency : graph.getOrDefault(node, Set.of())) if (cycle(dependency, graph, visiting, done)) return true;
        visiting.remove(node); done.add(node); return false;
    }
}
