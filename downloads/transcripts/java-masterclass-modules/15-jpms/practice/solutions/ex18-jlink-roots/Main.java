import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    static Set<String> imageModules(Map<String, Set<String>> graph, Set<String> roots) {
        Set<String> result = new HashSet<>();
        if (roots == null) return result;
        ArrayDeque<String> queue = new ArrayDeque<>(roots);
        while (!queue.isEmpty()) {
            String current = queue.remove();
            if (current == null || !result.add(current)) continue;
            queue.addAll(graph == null ? Set.of() : graph.getOrDefault(current, Set.of()));
        }
        return result;
    }
}
