import java.util.Set;
public class SelfCheck {
    public static void main(String[] args) {
        Main.Algebra<Integer> a = Main.analyze(Set.of(1,2,3), Set.of(3,4));
        check(a.union().equals(Set.of(1,2,3,4)) && a.intersection().equals(Set.of(3)));
        check(a.leftOnly().equals(Set.of(1,2)) && a.symmetricDifference().equals(Set.of(1,2,4)));
        try { a.union().add(9); throw new AssertionError(); } catch (UnsupportedOperationException expected) { }
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
