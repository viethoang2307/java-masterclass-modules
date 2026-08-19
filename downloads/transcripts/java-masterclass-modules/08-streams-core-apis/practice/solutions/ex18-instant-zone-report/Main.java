import java.time.*;
import java.time.format.*;

public class Main {
    public static String display(Instant instant, ZoneId zone) {
        ZonedDateTime local = instant.atZone(zone);
        return local.format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
    }

    public static String day(Instant instant, ZoneId zone) {
        return instant.atZone(zone).toLocalDate().toString();
    }

    public static void main(String[] args) {
        System.out.println(display(Instant.parse("2026-08-19T03:00:00Z"),
            ZoneId.of("Asia/Ho_Chi_Minh")));
    }
}

