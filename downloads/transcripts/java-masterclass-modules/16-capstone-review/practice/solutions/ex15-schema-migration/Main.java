import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    static List<Integer> plan(int current, int target, Map<Integer, Integer> migrations) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        int version = current;
        result.add(version);
        while (version != target) {
            if (!seen.add(version) || migrations == null || !migrations.containsKey(version)) throw new IllegalArgumentException("migration path");
            version = migrations.get(version);
            result.add(version);
        }
        return result;
    }
}
