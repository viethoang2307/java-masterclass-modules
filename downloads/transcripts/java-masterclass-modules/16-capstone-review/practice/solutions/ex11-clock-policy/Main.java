import java.time.Duration;
import java.time.Instant;

public class Main {
    static boolean expired(Instant created, Instant now, Duration ttl) {
        if (created == null || now == null || ttl == null || ttl.isNegative()) throw new IllegalArgumentException();
        return !now.isBefore(created.plus(ttl));
    }
}
