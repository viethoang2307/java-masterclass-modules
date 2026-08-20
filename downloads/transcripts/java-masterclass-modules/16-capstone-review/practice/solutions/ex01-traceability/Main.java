import java.util.ArrayList;
import java.util.List;

public class Main {
    record Requirement(String id, boolean hasDomain, boolean hasTest, boolean hasEvidence) {}

    static List<String> missingEvidence(List<Requirement> requirements) {
        List<String> result = new ArrayList<>();
        if (requirements == null) return result;
        for (Requirement requirement : requirements) if (requirement != null && (requirement.id() == null || !requirement.hasDomain() || !requirement.hasTest() || !requirement.hasEvidence())) result.add(requirement == null ? "null" : requirement.id());
        return result;
    }
}
