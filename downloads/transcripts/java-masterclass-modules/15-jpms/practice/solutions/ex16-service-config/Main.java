import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<String> validate(String descriptor, String service, List<String> providers) {
        String text = descriptor == null ? "" : descriptor;
        List<String> issues = new ArrayList<>();
        if (!text.matches("(?s).*\\buses\\s+" + java.util.regex.Pattern.quote(service) + "\\s*;.*")) issues.add("missing-uses");
        if (providers != null) for (String provider : providers) {
            if (provider == null || provider.isBlank()) { issues.add("invalid-provider"); continue; }
            String expected = "provides " + service + " with " + provider;
            if (!text.contains(expected)) issues.add("missing-provider:" + provider);
        }
        return issues;
    }
}
