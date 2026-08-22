import java.util.List;
import java.util.Set;

public class Main {
    record Module(String name, Set<String> exports, Set<String> opens) {}

    static List<String> issues(List<Module> modules) {
        // TODO: report exported internal packages and broad opens.
        return List.of();
    }
}
