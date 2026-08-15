import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
public class Main {
    static List<String> normalizeGroceries(List<String> items) {
        if (items == null) throw new IllegalArgumentException("items is null");
        List<String> result = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        for (String item : items) {
            if (item == null || item.strip().isEmpty()) continue;
            String cleaned = item.strip();
            if (seen.add(cleaned.toLowerCase(Locale.ROOT))) result.add(cleaned);
        }
        return List.copyOf(result);
    }
}
