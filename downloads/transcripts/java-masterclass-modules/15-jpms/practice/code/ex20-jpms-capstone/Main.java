import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    record Project(Map<String, Set<String>> requires, Map<String, Set<String>> packages, String app, String service, Map<String, Set<String>> providers) {}

    static List<String> audit(Project project) {
        // TODO: integrate graph, split-package, and service-provider checks into one report.
        return List.of();
    }
}
