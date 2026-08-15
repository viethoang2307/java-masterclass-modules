import java.util.ArrayList;
import java.util.List;
public class Main {
    record Summary(int count, String text) {}
    static Summary summarize(String separator, String... values) {
        if (separator == null || values == null) throw new IllegalArgumentException("null input");
        List<String> cleaned = new ArrayList<>();
        for (String value : values) if (value != null && !value.strip().isEmpty()) cleaned.add(value.strip());
        return new Summary(cleaned.size(), String.join(separator, cleaned));
    }
}
