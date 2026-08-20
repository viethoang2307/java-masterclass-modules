import java.time.*;
import java.util.*;
import java.util.regex.*;

public class Main {
    public record Parts(int year, int month, int day) {}
    private static final Pattern DATE =
        Pattern.compile("(?<year>\\d{4})-(?<month>\\d{2})-(?<day>\\d{2})");

    public static Optional<LocalDate> parse(String text) {
        Matcher matcher = DATE.matcher(text == null ? "" : text);
        if (!matcher.matches()) return Optional.empty();
        try {
            return Optional.of(LocalDate.of(
                Integer.parseInt(matcher.group("year")),
                Integer.parseInt(matcher.group("month")),
                Integer.parseInt(matcher.group("day"))));
        } catch (DateTimeException ex) {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        System.out.println(parse("2026-08-20"));
    }
}

