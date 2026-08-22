import java.util.Set;

public class Main {
    private static final Set<String> KEYWORDS = Set.of("class", "module", "requires", "exports", "opens", "uses", "provides", "with", "to", "transitive", "static", "open");

    static boolean isValidModuleName(String name) {
        if (name == null || name.isBlank()) return false;
        String[] parts = name.split("\\.", -1);
        for (String part : parts) {
            if (part.isEmpty() || KEYWORDS.contains(part) || !Character.isJavaIdentifierStart(part.codePointAt(0))) return false;
            for (int i = Character.charCount(part.codePointAt(0)); i < part.length();) {
                int cp = part.codePointAt(i);
                if (!Character.isJavaIdentifierPart(cp)) return false;
                i += Character.charCount(cp);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidModuleName(args.length == 0 ? "com.example.app" : args[0]));
    }
}
