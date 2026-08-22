import java.util.List;
import java.util.Set;

public class Main {
    private static final Set<String> RETRYABLE = Set.of("timeout", "server", "rate-limit");

    static String execute(List<String> outcomes, int maxAttempts) {
        if (maxAttempts <= 0) return "retry-exhausted";
        int limit = Math.min(maxAttempts, outcomes == null ? 0 : outcomes.size());
        for (int i = 0; i < limit; i++) {
            String outcome = outcomes.get(i);
            if ("ok".equals(outcome)) return "success@" + (i + 1);
            if ("cancel".equals(outcome)) return "cancelled";
            if (!RETRYABLE.contains(outcome)) return "non-retryable";
        }
        return "retry-exhausted";
    }
}
