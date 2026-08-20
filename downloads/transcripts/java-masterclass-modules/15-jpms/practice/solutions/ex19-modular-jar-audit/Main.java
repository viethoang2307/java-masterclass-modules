import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern MODULE = Pattern.compile("\\bmodule\\s+([A-Za-z_$][\\w$]*(?:\\.[A-Za-z_$][\\w$]*)*)");
    private static final Pattern EXPORT = Pattern.compile("\\bexports\\s+([A-Za-z_$][\\w$]*(?:\\.[A-Za-z_$][\\w$]*)*)");

    static List<String> audit(String moduleName, String descriptor, Set<String> packages) {
        List<String> issues = new ArrayList<>();
        Matcher module = MODULE.matcher(descriptor == null ? "" : descriptor);
        if (!module.find()) issues.add("not-modular");
        else if (!module.group(1).equals(moduleName)) issues.add("wrong-module:" + module.group(1));
        Matcher export = EXPORT.matcher(descriptor == null ? "" : descriptor);
        while (export.find()) if (packages == null || !packages.contains(export.group(1))) issues.add("missing-package:" + export.group(1));
        return issues;
    }
}
