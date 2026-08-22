import java.util.Map;
import java.util.Set;

public class Main {
    static boolean canAccess(String packageName, String requester, Set<String> openExports, Map<String, Set<String>> qualifiedExports) {
        if (packageName == null || requester == null) return false;
        if (openExports != null && openExports.contains(packageName)) return true;
        return qualifiedExports != null && qualifiedExports.getOrDefault(packageName, Set.of()).contains(requester);
    }
}
