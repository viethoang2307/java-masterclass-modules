import java.util.List;

public class SelfCheck {
    public static void main(String[] args) {
        String good = "uses com.acme.Storage; provides com.acme.Storage with com.acme.FileStorage;";
        check(Main.validate(good, "com.acme.Storage", List.of("com.acme.FileStorage")).isEmpty());
        check(Main.validate("", "com.acme.Storage", List.of("com.acme.FileStorage")).equals(List.of("missing-uses", "missing-provider:com.acme.FileStorage")));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
