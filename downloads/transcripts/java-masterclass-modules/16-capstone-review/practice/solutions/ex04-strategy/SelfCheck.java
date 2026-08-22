import java.util.List;

public class SelfCheck {
    public static void main(String[] args) {
        var result = Main.choose(List.of(new Main.Strategy("csv", 1, true), new Main.Strategy("csv", 4, false), new Main.Strategy("csv", 3, true)), "csv");
        check(result.priority() == 3);
        check(Main.choose(List.of(new Main.Strategy("json", 1, true)), "csv") == null);
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
