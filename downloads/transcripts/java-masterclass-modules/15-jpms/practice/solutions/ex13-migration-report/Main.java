import java.util.ArrayList;
import java.util.List;

public class Main {
    record Artifact(String name, String kind, String moduleName) {}

    static List<String> actions(List<Artifact> artifacts) {
        List<String> result = new ArrayList<>();
        if (artifacts == null) return result;
        for (Artifact artifact : artifacts) {
            if (artifact == null || artifact.name() == null) continue;
            String action = switch (artifact.kind() == null ? "" : artifact.kind()) {
                case "named" -> "verify-descriptor:" + artifact.name();
                case "automatic" -> "pin-automatic-name:" + artifact.name() + "=" + (artifact.moduleName() == null ? "unknown" : artifact.moduleName());
                case "legacy" -> "keep-classpath:" + artifact.name();
                default -> "review:" + artifact.name();
            };
            result.add(action);
        }
        return result;
    }
}
