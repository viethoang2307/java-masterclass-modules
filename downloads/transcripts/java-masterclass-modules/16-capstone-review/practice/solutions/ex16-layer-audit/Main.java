import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    static List<String> violations(Map<String, Set<String>> dependencies) {
        Map<String, Set<String>> allowed = Map.of("ui", Set.of("application", "domain", "port"), "application", Set.of("domain", "port"), "infrastructure", Set.of("domain", "port"), "port", Set.of("domain"), "domain", Set.of());
        Set<String> known = new HashSet<>(allowed.keySet());
        List<String> result = new ArrayList<>();
        if (dependencies != null) for (Map.Entry<String, Set<String>> entry : dependencies.entrySet()) {
            String from = entry.getKey();
            for (String to : entry.getValue() == null ? Set.<String>of() : entry.getValue()) if (!known.contains(from) || !known.contains(to) || !allowed.getOrDefault(from, Set.of()).contains(to)) result.add(from + "->" + to);
        }
        Collections.sort(result);
        return result;
    }
}
