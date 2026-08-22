import java.util.List;

public class Main {
    record Strategy(String id, int priority, boolean available) {}

    static Strategy choose(List<Strategy> strategies, String requestedId) {
        if (strategies == null || requestedId == null) return null;
        Strategy best = null;
        for (Strategy strategy : strategies) {
            if (strategy == null || !strategy.available() || !requestedId.equals(strategy.id())) continue;
            if (best == null || strategy.priority() > best.priority()) best = strategy;
        }
        return best;
    }
}
