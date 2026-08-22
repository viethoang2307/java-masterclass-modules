import java.util.List;

public class Main {
    record Requirement(String id, boolean hasDomain, boolean hasTest, boolean hasEvidence) {}

    static List<String> missingEvidence(List<Requirement> requirements) {
        // TODO: return IDs for requirements missing any of domain, test, or evidence.
        return List.of();
    }
}
