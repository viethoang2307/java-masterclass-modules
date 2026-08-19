import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        List<Integer> first = Main.dice(new Random(42), 5);
        List<Integer> second = Main.dice(new Random(42), 5);
        check(first.equals(second), "seed reproducibility");
        check(first.stream().allMatch(value -> value >= 1 && value <= 6), "bounds");
        boolean failed = false;
        try { Main.dice(new Random(), -1); } catch (IllegalArgumentException expected) { failed = true; }
        check(failed, "negative count");
        System.out.println("PASS");
    }
}

