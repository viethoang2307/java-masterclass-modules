import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    static Set<String> readableModules(Map<String, Set<String>> graph, String root) {
        Set<String> result = new HashSet<>();
        if (root == null) return result;
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            String current = queue.remove();
            if (!result.add(current)) continue;
            queue.addAll(graph.getOrDefault(current, Set.of()));
        }
        return result;
    }
}
