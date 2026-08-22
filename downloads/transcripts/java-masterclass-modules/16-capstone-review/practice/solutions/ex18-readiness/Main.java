import java.util.List;

public class Main {
    record Check(String id, boolean passed, int weight) {}

    static int score(List<Check> checks) {
        int total = 0;
        if (checks == null) return 0;
        for (Check check : checks) {
            if (check == null || check.weight() < 0) throw new IllegalArgumentException("invalid weight");
            if (check.passed()) total += check.weight();
        }
        return total;
    }

    static String status(List<Check> checks) {
        if (checks == null || checks.isEmpty()) return "NOT_READY";
        for (Check check : checks) if (check == null || !check.passed() || check.weight() < 0) return "NOT_READY";
        return "READY";
    }
}
