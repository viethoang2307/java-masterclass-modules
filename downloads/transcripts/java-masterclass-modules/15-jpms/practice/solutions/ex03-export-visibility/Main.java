import java.util.Set;

public class Main {
    static boolean isExported(String packageName, Set<String> exports) {
        return packageName != null && exports != null && exports.contains(packageName);
    }
}
