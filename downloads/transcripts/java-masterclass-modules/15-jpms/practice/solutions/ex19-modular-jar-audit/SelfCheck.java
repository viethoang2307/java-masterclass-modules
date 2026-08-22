import java.util.List;
import java.util.Set;

public class SelfCheck {
    public static void main(String[] args) {
        String d = "module com.acme.lib { exports com.acme.api; }";
        check(Main.audit("com.acme.lib", d, Set.of("com.acme.api")).isEmpty());
        check(Main.audit("com.acme.lib", "exports com.acme.api;", Set.of()).equals(List.of("not-modular", "missing-package:com.acme.api")));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
