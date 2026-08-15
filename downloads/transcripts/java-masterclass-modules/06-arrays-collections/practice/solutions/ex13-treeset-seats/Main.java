import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;
public class Main {
    record Seat(char row, int number, int priceCents) {}
    static final class Theatre {
        private static final Comparator<Seat> ORDER = Comparator.comparingInt(Seat::row).thenComparingInt(Seat::number);
        private final NavigableSet<Seat> available = new TreeSet<>(ORDER);
        Theatre(Collection<Seat> seats) {
            if (seats == null || seats.stream().anyMatch(s -> s == null || s.number() <= 0 || s.priceCents() < 0)) throw new IllegalArgumentException("invalid seats");
            available.addAll(seats);
            if (available.size() != seats.size()) throw new IllegalArgumentException("duplicate position");
        }
        Seat bookAtOrAfter(char row, int number) {
            Seat chosen = available.ceiling(new Seat(row, number, 0));
            if (chosen != null) available.remove(chosen);
            return chosen;
        }
        int availableCount() { return available.size(); }
    }
}
