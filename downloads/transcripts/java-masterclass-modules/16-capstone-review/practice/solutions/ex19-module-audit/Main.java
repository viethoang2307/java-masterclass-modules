import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    record Module(String name, java.util.Set<String> exports, java.util.Set<String> opens) {}

    static List<String> issues(List<Module> modules) {
        List<String> result = new ArrayList<>();
        if (modules != null) for (Module module : modules) {
            if (module == null || module.name() == null) continue;
            if (module.opens() != null && module.opens().contains("*")) result.add("broad-opens:" + module.name());
            if (module.exports() != null) for (String pkg : module.exports()) if (pkg != null && pkg.endsWith(".internal")) result.add("internal-export:" + module.name() + ":" + pkg);
        }
        Collections.sort(result);
        return result;
    }
}
