import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern REQUIRES = Pattern.compile("\\brequires\\s+((?:(?:transitive|static)\\s+)*)([A-Za-z_$][\\w$]*(?:\\.[A-Za-z_$][\\w$]*)*)");

    static String runtimeDirective(String descriptor, String dependency) {
        Matcher matcher = REQUIRES.matcher(descriptor == null ? "" : descriptor);
        while (matcher.find()) {
            if (!matcher.group(2).equals(dependency)) continue;
            return matcher.group(1).contains("static") ? "requires static" : "requires";
        }
        return "absent";
    }
}
