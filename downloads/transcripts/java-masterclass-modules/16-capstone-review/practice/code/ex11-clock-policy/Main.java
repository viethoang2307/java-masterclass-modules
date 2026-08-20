import java.time.Duration;
import java.time.Instant;

public class Main {
    static boolean expired(Instant created, Instant now, Duration ttl) {
        // TODO: evaluate expiry deterministically without reading the system clock.
        return false;
    }
}
