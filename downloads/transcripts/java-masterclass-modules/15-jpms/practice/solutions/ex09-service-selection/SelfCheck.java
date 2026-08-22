import java.util.List;

public class SelfCheck {
    public static void main(String[] args) {
        var list = List.of(new Main.Provider("file", 2, true), new Main.Provider("file", 5, false), new Main.Provider("file", 3, true), new Main.Provider("memory", 9, true));
        check(Main.select(list, "file").orElseThrow().priority() == 3);
        check(Main.select(list, "missing").isEmpty());
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
