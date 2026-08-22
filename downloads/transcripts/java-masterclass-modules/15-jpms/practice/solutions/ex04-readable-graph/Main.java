import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    static boolean canRead(Map<String, Set<String>> graph, String from, String target) {
        if (from == null || target == null) return false;
        ArrayDeque<String> queue = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        queue.add(from);
        while (!queue.isEmpty()) {
            String current = queue.remove();
            if (!visited.add(current)) continue;
            if (current.equals(target)) return true;
            for (String next : graph.getOrDefault(current, Set.of())) queue.add(next);
        }
        return false;
    }
}
