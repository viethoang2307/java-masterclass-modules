import java.util.Set;

public class SelfCheck {
    public static void main(String[] args) {
        String d = "module com.acme.app { exports com.acme.api; exports com.acme.missing; }";
        check(Main.audit("com.acme.app", d, Set.of("com.acme.api")).equals(java.util.List.of("missing-export:com.acme.missing")));
        check(Main.audit("wrong", d, Set.of("com.acme.api")).contains("missing-module"));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
