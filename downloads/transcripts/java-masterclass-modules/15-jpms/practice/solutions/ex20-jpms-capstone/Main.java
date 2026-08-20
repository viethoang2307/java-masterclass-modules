import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    record Project(Map<String, Set<String>> requires, Map<String, Set<String>> packages, String app, String service, Map<String, Set<String>> providers) {}

    static List<String> audit(Project project) {
        List<String> issues = new ArrayList<>();
        if (project == null) return List.of("invalid-project");
        Set<String> reachable = reachable(project.requires(), project.app());
        if (!reachable.contains(project.service())) issues.add("unreachable-service");
        for (String pkg : splitPackages(project.packages())) issues.add("split-package:" + pkg);
        if (project.providers() == null || project.providers().getOrDefault(project.service(), Set.of()).isEmpty()) issues.add("missing-provider");
        return issues;
    }

    private static Set<String> reachable(Map<String, Set<String>> graph, String root) {
        Set<String> result = new HashSet<>();
        if (root == null) return result;
        ArrayDeque<String> queue = new ArrayDeque<>(); queue.add(root);
        while (!queue.isEmpty()) { String node = queue.remove(); if (result.add(node)) queue.addAll(graph == null ? Set.of() : graph.getOrDefault(node, Set.of())); }
        return result;
    }

    private static Set<String> splitPackages(Map<String, Set<String>> modules) {
        Map<String, Integer> counts = new HashMap<>();
        if (modules != null) for (Set<String> packages : modules.values()) if (packages != null) for (String pkg : packages) if (pkg != null) counts.merge(pkg, 1, Integer::sum);
        Set<String> result = new HashSet<>();
        for (Map.Entry<String, Integer> entry : counts.entrySet()) if (entry.getValue() > 1) result.add(entry.getKey());
        return result;
    }
}
