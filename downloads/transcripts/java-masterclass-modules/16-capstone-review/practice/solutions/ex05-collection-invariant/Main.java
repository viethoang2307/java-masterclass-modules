import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static boolean validIds(List<String> ids) {
        if (ids == null) return false;
        Set<String> seen = new HashSet<>();
        for (String id : ids) if (id == null || id.isBlank() || !seen.add(id.trim())) return false;
        return true;
    }
}
