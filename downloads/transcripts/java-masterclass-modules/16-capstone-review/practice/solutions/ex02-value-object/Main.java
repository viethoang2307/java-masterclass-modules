public class Main {
    static String normalizeArtist(String raw) {
        if (raw == null) throw new IllegalArgumentException("artist is required");
        String value = raw.trim();
        if (value.isEmpty() || value.length() > 120) throw new IllegalArgumentException("invalid artist");
        return value;
    }
}
