import java.util.*;

public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        List<Number> merged = Main.merge(List.of(1, 2), List.of(3.5));
        check(merged.equals(List.of(1, 2, 3.5)), "merge");
        check(Main.powersOfTwo(4).equals(List.of(1, 2, 4, 8)), "iterate limit");
        System.out.println("PASS");
    }
}

