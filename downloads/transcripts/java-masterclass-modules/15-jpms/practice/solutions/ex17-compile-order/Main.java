import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    static List<String> compileOrder(Map<String, Set<String>> dependencies) {
        Set<String> nodes = new HashSet<>();
        if (dependencies != null) {
            nodes.addAll(dependencies.keySet());
            for (Set<String> deps : dependencies.values()) if (deps != null) nodes.addAll(deps);
        }
        List<String> sorted = new ArrayList<>(nodes);
        Collections.sort(sorted);
        Map<String, Integer> state = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (String node : sorted) visit(node, dependencies == null ? Map.of() : dependencies, state, result);
        return result;
    }

    private static void visit(String node, Map<String, Set<String>> graph, Map<String, Integer> state, List<String> result) {
        int current = state.getOrDefault(node, 0);
        if (current == 1) throw new IllegalArgumentException("cycle");
        if (current == 2) return;
        state.put(node, 1);
        List<String> deps = new ArrayList<>(graph.getOrDefault(node, Set.of()));
        Collections.sort(deps);
        for (String dependency : deps) visit(dependency, graph, state, result);
        state.put(node, 2);
        result.add(node);
    }
}
