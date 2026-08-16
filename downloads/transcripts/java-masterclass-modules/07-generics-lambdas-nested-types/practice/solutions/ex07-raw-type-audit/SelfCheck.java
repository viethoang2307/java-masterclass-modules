import java.util.*;

public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        List<String> values = Main.readStrings(List.of("a", "b"));
        check(values.equals(List.of("a", "b")), "valid values");
        boolean failed = false;
        try { Main.readStrings(Arrays.asList("ok", 42)); }
        catch (IllegalArgumentException expected) { failed = true; }
        check(failed, "mixed values");
        check(Main.safeLegacyBoundary(List.of("x")).equals(List.of("x")), "legacy boundary");
        System.out.println("PASS");
    }
}

