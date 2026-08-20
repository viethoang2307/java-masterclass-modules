import java.util.List;
import java.util.Set;

public class SelfCheck {
    public static void main(String[] args) {
        var modules = List.of(new Main.Module("app", Set.of("com.acme.api", "com.acme.internal"), Set.of("*")), new Main.Module("common", Set.of("com.acme.common"), Set.of()));
        check(Main.issues(modules).equals(List.of("broad-opens:app", "internal-export:app:com.acme.internal")));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
