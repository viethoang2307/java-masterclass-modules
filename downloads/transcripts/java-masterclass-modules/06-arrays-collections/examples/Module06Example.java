import java.util.*;

public class Module06Example {
    public static void main(String[] args) {
        List<String> input = List.of("java", "java", "oop", "collections");
        Set<String> unique = new LinkedHashSet<>(input);
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (String word : input) counts.merge(word, 1, Integer::sum);
        System.out.println(unique);
        System.out.println(counts);
    }
}