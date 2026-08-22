import java.util.List;

public class SelfCheck {
    public static void main(String[] args) {
        check(Main.validIds(List.of("t1", "t2")));
        check(!Main.validIds(List.of("t1", " t1 ")));
        check(!Main.validIds(List.of(" ")));
        check(!Main.validIds(null));
        check(Main.validIds(List.of("a", "A")));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
