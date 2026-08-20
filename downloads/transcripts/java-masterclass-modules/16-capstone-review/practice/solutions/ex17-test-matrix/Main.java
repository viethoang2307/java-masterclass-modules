import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    record Case(String requirement, Set<String> types) {}

    static List<String> incomplete(List<Case> cases) {
        List<String> result = new ArrayList<>();
        if (cases == null) return result;
        for (Case testCase : cases) if (testCase != null && (testCase.requirement() == null || testCase.types() == null || !testCase.types().containsAll(Set.of("happy", "invalid", "failure")))) result.add(testCase.requirement());
        return result;
    }
}
