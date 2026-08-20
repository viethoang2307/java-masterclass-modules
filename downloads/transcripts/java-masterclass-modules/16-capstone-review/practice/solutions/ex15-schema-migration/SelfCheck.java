import java.util.List;
import java.util.Map;

public class SelfCheck {
    public static void main(String[] args) {
        check(Main.plan(1, 3, Map.of(1, 2, 2, 3)).equals(List.of(1, 2, 3)));
        check(Main.plan(3, 3, Map.of()).equals(List.of(3)));
        try { Main.plan(1, 3, Map.of(1, 2)); throw new AssertionError(); } catch (IllegalArgumentException expected) { }
        try { Main.plan(1, 3, Map.of(1, 2, 2, 1)); throw new AssertionError(); } catch (IllegalArgumentException expected) { }
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
