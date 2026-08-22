import java.util.List;

public class Main {
    record Artifact(String name, String kind, String moduleName) {}

    static List<String> actions(List<Artifact> artifacts) {
        // TODO: classify named, automatic, and legacy artifacts into migration actions.
        return List.of();
    }
}
