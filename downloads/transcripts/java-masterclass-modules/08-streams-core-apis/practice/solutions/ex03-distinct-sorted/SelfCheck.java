import java.util.*;

public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        List<String> result = Main.uniqueSortedIgnoreCase(Arrays.asList("Java", "java", "Stream", null, "API"));
        check(result.equals(List.of("api", "java", "stream")), "distinct sorted");
        System.out.println("PASS");
    }
}

