import java.util.Map;
import java.util.Set;

public class Main {
    static boolean canAccess(String packageName, String requester, Set<String> openExports, Map<String, Set<String>> qualifiedExports) {
        // TODO: allow an unqualified export or an export explicitly addressed to requester.
        return false;
    }
}
