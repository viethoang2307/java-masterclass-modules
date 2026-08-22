import java.util.Map;
import java.util.Set;

public class SelfCheck {
    public static void main(String[] args) {
        Map<String, Set<String>> modules = Map.of("api", Set.of("com.acme.api", "com.acme.shared"), "impl", Set.of("com.acme.shared", "com.acme.impl"));
        check(Main.splitPackages(modules).equals(Set.of("com.acme.shared")));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
