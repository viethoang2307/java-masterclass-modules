import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        Map<String, Integer> result = Main.latestByKey(List.of(
            new Main.Event("a", 1), new Main.Event("b", 2), new Main.Event("a", 3)));
        check(result.get("a") == 3 && result.get("b") == 2, "latest");
        check(new ArrayList<>(result.keySet()).equals(List.of("a", "b")), "order");
        System.out.println("PASS");
    }
}

