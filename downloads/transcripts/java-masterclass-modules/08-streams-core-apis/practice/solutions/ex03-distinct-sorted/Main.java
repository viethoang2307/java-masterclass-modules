import java.util.*;

public class Main {
    public static List<String> uniqueSortedIgnoreCase(List<String> values) {
        return values.stream()
            .filter(Objects::nonNull)
            .map(String::toLowerCase)
            .distinct()
            .sorted()
            .toList();
    }

    public static void main(String[] args) {
        System.out.println(uniqueSortedIgnoreCase(List.of("Java", "java", "Stream")));
    }
}

