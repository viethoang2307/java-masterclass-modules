import java.util.ArrayList;
import java.util.List;

public class SelfCheck {
    public static void main(String[] args) {
        var current = new Main.Snapshot(2, List.of("new"));
        var stale = new Main.Snapshot(1, List.of("old"));
        check(Main.accept(current, stale) == current);
        var mutable = new ArrayList<>(List.of("latest"));
        var accepted = Main.accept(current, new Main.Snapshot(3, mutable));
        mutable.add("mutated");
        check(accepted.items().equals(List.of("latest")));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
