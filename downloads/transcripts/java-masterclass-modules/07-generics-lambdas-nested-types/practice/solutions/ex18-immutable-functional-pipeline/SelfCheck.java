import java.util.*;

public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Pipeline<Integer> original = Main.Pipeline.of(List.of(1, 2, 3));
        Main.Pipeline<String> mapped = original.filter(value -> value > 1).map(Object::toString);
        check(original.toList().equals(List.of(1, 2, 3)), "immutable original");
        check(mapped.toList().equals(List.of("2", "3")), "pipeline");
        boolean failed = false;
        try { mapped.toList().add("4"); } catch (UnsupportedOperationException expected) { failed = true; }
        check(failed, "immutable result");
        System.out.println("PASS");
    }
}

