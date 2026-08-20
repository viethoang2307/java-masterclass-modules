import java.util.List;

public class Main {
    record Snapshot(long requestId, List<String> items) {}

    static Snapshot accept(Snapshot current, Snapshot incoming) {
        if (incoming == null) return current;
        if (current != null && incoming.requestId() <= current.requestId()) return current;
        return new Snapshot(incoming.requestId(), List.copyOf(incoming.items() == null ? List.of() : incoming.items()));
    }
}
