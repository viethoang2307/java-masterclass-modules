import java.util.*;
import java.util.stream.*;

public class Main {
    public record Event(String key, int value) {}

    public static Map<String, Integer> latestByKey(List<Event> events) {
        return events.stream().collect(Collectors.toMap(
            Event::key, Event::value, (oldValue, newValue) -> newValue,
            LinkedHashMap::new));
    }

    public static void main(String[] args) {
        System.out.println(latestByKey(List.of(new Event("a", 1), new Event("a", 2))));
    }
}

