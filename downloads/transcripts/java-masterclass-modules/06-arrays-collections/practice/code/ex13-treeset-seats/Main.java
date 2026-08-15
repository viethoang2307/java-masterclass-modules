import java.util.Collection;
public class Main {
    record Seat(char row, int number, int priceCents) {}
    static final class Theatre {
        Theatre(Collection<Seat> seats) { /* TODO: build a TreeSet with a complete comparator. */ }
        Seat bookAtOrAfter(char row, int number) {
            // TODO: use ceiling and remove the booked seat.
            return null;
        }
        int availableCount() { return 0; }
    }
}
