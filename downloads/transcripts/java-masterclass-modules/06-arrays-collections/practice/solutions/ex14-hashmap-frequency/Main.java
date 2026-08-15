import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
public class Main {
    static Map<String, Integer> frequencies(String text) {
        if (text == null) throw new IllegalArgumentException("text is null");
        Map<String,Integer> counts = new HashMap<>();
        for (String token : text.toLowerCase(Locale.ROOT).split("[^\\p{L}\\p{N}]+")) if (!token.isBlank()) counts.merge(token, 1, Integer::sum);
        return Collections.unmodifiableMap(new TreeMap<>(counts));
    }
}
