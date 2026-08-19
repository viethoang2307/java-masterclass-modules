import java.util.*;

public class Main {
    public record Article(String title, List<String> tags) {
        public Article { tags = List.copyOf(tags); }
    }

    public static List<String> allTags(List<Article> articles) {
        return articles.stream()
            .filter(Objects::nonNull)
            .flatMap(article -> article.tags().stream())
            .filter(Objects::nonNull)
            .map(String::strip)
            .filter(tag -> !tag.isBlank())
            .map(String::toLowerCase)
            .distinct()
            .sorted()
            .toList();
    }

    public static void main(String[] args) {
        System.out.println(allTags(List.of(new Article("x", List.of("Java", "API")))));
    }
}

