import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern REQUIRES = Pattern.compile("\\brequires\\s+(?:(?:transitive|static)\\s+)*([A-Za-z_$][\\w$]*(?:\\.[A-Za-z_$][\\w$]*)*)");
    private static final Pattern EXPORTS = Pattern.compile("\\bexports\\s+([A-Za-z_$][\\w$]*(?:\\.[A-Za-z_$][\\w$]*)*)");

    static Set<String> requires(String descriptor) { return find(REQUIRES, descriptor); }
    static Set<String> exports(String descriptor) { return find(EXPORTS, descriptor); }

    private static Set<String> find(Pattern pattern, String text) {
        Set<String> result = new LinkedHashSet<>();
        Matcher matcher = pattern.matcher(text == null ? "" : text);
        while (matcher.find()) result.add(matcher.group(1));
        return result;
    }
}
