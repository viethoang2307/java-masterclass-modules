import java.util.*;

public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Player b = new Main.Player("b", "B", 10, 200);
        Main.Player a = new Main.Player("a", "A", 10, 100);
        Main.Player c = new Main.Player("c", "C", 9, 1);
        List<Main.Player> ranked = Main.rank(List.of(b, a, c));
        check(ranked.equals(List.of(a, b, c)), "ranking");
        TreeSet<Main.Player> set = new TreeSet<>(Main.RANKING);
        set.add(b); set.add(a);
        check(set.size() == 2, "tie breaker");
        System.out.println("PASS");
    }
}

