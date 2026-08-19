import java.time.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        Instant instant = Instant.parse("2026-08-19T03:00:00Z");
        String result = Main.display(instant, ZoneId.of("Asia/Ho_Chi_Minh"));
        check(result.contains("2026-08-19T10:00:00+07:00"), "zone conversion");
        check(Main.day(instant, ZoneOffset.UTC).equals("2026-08-19"), "UTC day");
        System.out.println("PASS");
    }
}

