import java.util.List;

public class Main {
    record Snapshot(long requestId, List<String> items) {}

    static Snapshot accept(Snapshot current, Snapshot incoming) {
        // TODO: ignore stale responses and copy accepted items immutably.
        return current;
    }
}
