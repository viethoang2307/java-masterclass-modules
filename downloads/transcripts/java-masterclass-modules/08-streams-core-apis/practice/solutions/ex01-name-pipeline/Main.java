import java.util.*;

public class Main {
    public static List<String> normalize(List<String> values) {
        return values.stream()
            .filter(Objects::nonNull)
            .map(String::strip)
            .filter(value -> !value.isBlank())
            .map(String::toLowerCase)
            .toList();
    }

    public static void main(String[] args) {
        System.out.println(normalize(List.of(" An ", "JAVA")));
    }
}

