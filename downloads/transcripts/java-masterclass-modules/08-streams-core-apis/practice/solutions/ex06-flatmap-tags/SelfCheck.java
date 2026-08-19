import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        List<Main.Article> articles = List.of(
            new Main.Article("a", List.of("Java", " API ")),
            new Main.Article("b", List.of("java", "Streams")));
        check(Main.allTags(articles).equals(List.of("api", "java", "streams")), "flatMap");
        System.out.println("PASS");
    }
}

