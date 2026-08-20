import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    record Provider(String id, int priority, boolean healthy) {}

    static Optional<Provider> select(List<Provider> providers, String id) {
        if (providers == null || id == null) return Optional.empty();
        return providers.stream()
            .filter(p -> p != null && p.healthy() && id.equals(p.id()))
            .max(Comparator.comparingInt(Provider::priority));
    }
}
