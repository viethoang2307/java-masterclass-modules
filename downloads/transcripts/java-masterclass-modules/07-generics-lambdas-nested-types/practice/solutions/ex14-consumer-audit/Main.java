import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static List<String> process(List<String> events) {
        List<String> auditLog = new ArrayList<>();
        Consumer<String> normalize = value -> auditLog.add("N:" + value.trim());
        Consumer<String> persist = value -> auditLog.add("P:" + value.trim());
        Consumer<String> pipeline = normalize.andThen(persist);
        for (String event : events) pipeline.accept(event);
        return List.copyOf(auditLog);
    }

    public static void sendAll(List<String> values, Consumer<? super String> sink) {
        values.forEach(sink);
    }

    public static void main(String[] args) {
        System.out.println(process(List.of(" a ")));
    }
}

