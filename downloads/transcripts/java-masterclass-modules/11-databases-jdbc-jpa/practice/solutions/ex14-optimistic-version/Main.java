public class Main {
    public static String update(long expectedVersion, String value) {
        long currentVersion = 1;
        if (expectedVersion != currentVersion) return "CONFLICT";
        if (value == null || value.isBlank()) throw new IllegalArgumentException();
        return "OK:" + (currentVersion + 1);
    }
}
