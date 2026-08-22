import java.util.Map;
import java.util.Set;

public class SelfCheck {
    public static void main(String[] args) {
        Map<String, Set<String>> q = Map.of("com.acme.spi", Set.of("com.acme.impl", "testkit"));
        check(Main.canAccess("com.acme.api", "any", Set.of("com.acme.api"), q));
        check(Main.canAccess("com.acme.spi", "testkit", Set.of(), q));
        check(!Main.canAccess("com.acme.spi", "other", Set.of(), q));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
