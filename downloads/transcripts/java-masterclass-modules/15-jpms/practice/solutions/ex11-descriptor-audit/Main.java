import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern MODULE = Pattern.compile("\\bmodule\\s+([A-Za-z_$][\\w$]*(?:\\.[A-Za-z_$][\\w$]*)*)");
    private static final Pattern EXPORT = Pattern.compile("\\bexports\\s+([A-Za-z_$][\\w$]*(?:\\.[A-Za-z_$][\\w$]*)*)");

    static List<String> audit(String moduleName, String descriptor, Set<String> actualPackages) {
        List<String> issues = new ArrayList<>();
        Matcher module = MODULE.matcher(descriptor == null ? "" : descriptor);
        if (!module.find() || !module.group(1).equals(moduleName)) issues.add("missing-module");
        Matcher exports = EXPORT.matcher(descriptor == null ? "" : descriptor);
        while (exports.find()) if (actualPackages == null || !actualPackages.contains(exports.group(1))) issues.add("missing-export:" + exports.group(1));
        return issues;
    }
}
