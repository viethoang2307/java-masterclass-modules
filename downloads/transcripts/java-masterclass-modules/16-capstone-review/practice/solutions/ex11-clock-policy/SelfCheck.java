import java.time.Duration;
import java.time.Instant;

public class SelfCheck {
    public static void main(String[] args) {
        var start = Instant.parse("2026-01-01T00:00:00Z");
        check(!Main.expired(start, start.plusSeconds(299), Duration.ofMinutes(5)));
        check(Main.expired(start, start.plusSeconds(300), Duration.ofMinutes(5)));
        try { Main.expired(start, start, Duration.ofSeconds(-1)); throw new AssertionError(); } catch (IllegalArgumentException expected) { }
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
