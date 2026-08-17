import java.util.*;

public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.parse(Integer.class, "42") == 42, "integer parse");
        check("java".equals(Main.parse(String.class, "java")), "string parse");
        check(Main.firstOrDefault(List.of(), 9) == 9, "fallback");
        boolean failed = false;
        try { Main.parse(Double.class, "1.2"); } catch (IllegalArgumentException expected) { failed = true; }
        check(failed, "unsupported type");
        System.out.println("PASS");
    }
}

