import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        Map<String, Double> result = Main.averageByCourse(List.of(
            new Main.Student("a", 80, List.of("java", "sql")),
            new Main.Student("b", 90, List.of("java")),
            new Main.Student("c", 70, List.of())));
        check(result.get("java") == 85.0 && result.get("sql") == 80.0, "average");
        check(!result.containsKey("missing"), "empty course");
        System.out.println("PASS");
    }
}

