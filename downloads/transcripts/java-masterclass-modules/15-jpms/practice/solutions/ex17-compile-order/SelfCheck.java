import java.util.Map;
import java.util.Set;

public class SelfCheck {
    public static void main(String[] args) {
        var order = Main.compileOrder(Map.of("app", Set.of("db", "ui"), "db", Set.of("common"), "ui", Set.of("common"), "common", Set.of()));
        check(order.indexOf("common") < order.indexOf("db"));
        check(order.indexOf("common") < order.indexOf("ui"));
        check(order.indexOf("db") < order.indexOf("app"));
        try { Main.compileOrder(Map.of("a", Set.of("b"), "b", Set.of("a"))); throw new AssertionError(); } catch (IllegalArgumentException expected) { }
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
