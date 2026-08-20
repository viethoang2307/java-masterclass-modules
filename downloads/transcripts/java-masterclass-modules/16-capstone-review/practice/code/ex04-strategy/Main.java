import java.util.List;

public class Main {
    record Strategy(String id, int priority, boolean available) {}

    static Strategy choose(List<Strategy> strategies, String requestedId) {
        // TODO: choose the available matching strategy with highest priority.
        return null;
    }
}
