import java.util.*;

public class Main {
    public static List<String> readStrings(List<?> rawValues) {
        List<String> result = new ArrayList<>();
        for (Object value : rawValues) {
            if (!(value instanceof String text)) {
                throw new IllegalArgumentException("non-string value");
            }
            result.add(text);
        }
        return List.copyOf(result);
    }

    public static List<String> safeLegacyBoundary(Object value) {
        if (!(value instanceof List<?> list)) {
            throw new IllegalArgumentException("expected list");
        }
        return readStrings(list);
    }

    public static void main(String[] args) {
        System.out.println(readStrings(List.of("a", "b")));
    }
}

