import java.util.List;
import java.util.Set;

public class Main {
    record Case(String requirement, Set<String> types) {}

    static List<String> incomplete(List<Case> cases) {
        // TODO: require happy, invalid, and failure coverage for every requirement.
        return List.of();
    }
}
