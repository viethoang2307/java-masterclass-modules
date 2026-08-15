import java.util.Locale;

public class Main {
    static String normalize(String raw) {
        if (raw == null || raw.isBlank()) return "";
        return raw.strip().toLowerCase(Locale.ROOT).replaceAll("\\s+", "-");
    }
    public static void main(String[] args) {
        System.out.println(normalize(" Java 17 OOP "));
    }
}

