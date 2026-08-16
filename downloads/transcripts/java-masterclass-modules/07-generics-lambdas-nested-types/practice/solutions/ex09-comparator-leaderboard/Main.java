import java.util.*;

public class Main {
    public record Player(String id, String name, int score, long millis) {}

    public static final Comparator<Player> RANKING =
        Comparator.comparingInt(Player::score).reversed()
            .thenComparingLong(Player::millis)
            .thenComparing(Player::id);

    public static List<Player> rank(Collection<Player> players) {
        List<Player> result = new ArrayList<>(players);
        result.sort(RANKING);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(rank(List.of(new Player("b", "B", 10, 200),
            new Player("a", "A", 10, 100))));
    }
}

