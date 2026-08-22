import java.util.List;
import java.util.Optional;

public class Main {
    record Provider(String id, int priority, boolean healthy) {}

    static Optional<Provider> select(List<Provider> providers, String id) {
        // TODO: choose the healthy provider with the highest priority for id.
        return Optional.empty();
    }
}
