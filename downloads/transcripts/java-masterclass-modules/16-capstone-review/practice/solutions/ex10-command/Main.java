public class Main {
    static String normalize(String raw) {
        if (raw == null || raw.isBlank()) throw new IllegalArgumentException("command required");
        return raw.trim().replaceAll("\\s+", " ");
    }
}
