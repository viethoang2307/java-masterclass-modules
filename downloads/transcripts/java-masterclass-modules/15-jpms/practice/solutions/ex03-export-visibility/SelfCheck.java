import java.util.Set;

public class SelfCheck {
    public static void main(String[] args) {
        Set<String> exported = Set.of("com.acme.api", "com.acme.spi");
        check(Main.isExported("com.acme.api", exported));
        check(!Main.isExported("com.acme.api.internal", exported));
        check(!Main.isExported(null, exported));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
