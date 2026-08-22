import java.util.List;
import java.util.Set;

public class SelfCheck {
    public static void main(String[] args) {
        var cases = List.of(new Main.Case("sync", Set.of("happy", "invalid", "failure")), new Main.Case("import", Set.of("happy", "failure")), new Main.Case("delete", Set.of("happy", "invalid", "failure")));
        check(Main.incomplete(cases).equals(List.of("import")));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
