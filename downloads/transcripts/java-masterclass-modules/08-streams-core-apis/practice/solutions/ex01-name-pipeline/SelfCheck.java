import java.util.*;

public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        List<String> result = Main.normalize(Arrays.asList(" An ", null, " ", "JAVA"));
        check(result.equals(List.of("an", "java")), "normalize");
        boolean immutable = false;
        try { result.add("x"); } catch (UnsupportedOperationException expected) { immutable = true; }
        check(immutable, "immutable result");
        System.out.println("PASS");
    }
}

