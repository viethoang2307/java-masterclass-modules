import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    static Set<String> splitPackages(Map<String, Set<String>> modulePackages) {
        Map<String, Integer> owners = new HashMap<>();
        if (modulePackages != null) for (Set<String> packages : modulePackages.values()) if (packages != null) for (String pkg : packages) if (pkg != null) owners.merge(pkg, 1, Integer::sum);
        Set<String> result = new HashSet<>();
        for (Map.Entry<String, Integer> entry : owners.entrySet()) if (entry.getValue() > 1) result.add(entry.getKey());
        return result;
    }
}
