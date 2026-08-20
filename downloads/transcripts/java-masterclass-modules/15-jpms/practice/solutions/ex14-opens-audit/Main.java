import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern OPENS = Pattern.compile("\\bopens\\s+([A-Za-z_$][\\w$]*(?:\\.[A-Za-z_$][\\w$]*)*)(?:\\s+to\\s+([^;]+))?\\s*;");

    static boolean needsOpen(String descriptor, String packageName, String targetModule) {
        if (descriptor == null || packageName == null || targetModule == null) return false;
        Matcher matcher = OPENS.matcher(descriptor);
        while (matcher.find()) {
            if (!packageName.equals(matcher.group(1))) continue;
            String targets = matcher.group(2);
            if (targets == null) return true;
            for (String target : targets.split(",")) if (targetModule.equals(target.trim())) return true;
        }
        return false;
    }
}
