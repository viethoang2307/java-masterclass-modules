import java.time.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static LocalDate nextBusinessDay(LocalDate start, Set<DayOfWeek> holidays) {
        return Stream.iterate(start.plusDays(1), date -> date.plusDays(1))
            .filter(date -> date.getDayOfWeek() != DayOfWeek.SATURDAY)
            .filter(date -> date.getDayOfWeek() != DayOfWeek.SUNDAY)
            .filter(date -> !holidays.contains(date.getDayOfWeek()))
            .findFirst()
            .orElseThrow();
    }

    public static List<LocalDate> days(LocalDate start, int count) {
        return Stream.iterate(start, date -> date.plusDays(1)).limit(count).toList();
    }

    public static void main(String[] args) {
        System.out.println(days(LocalDate.of(2026, 8, 19), 3));
    }
}

