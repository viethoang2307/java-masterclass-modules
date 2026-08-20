public class Main {
    public static String classify(String state) {
        if (state == null) return "UNKNOWN";
        return switch (state) {
            case "23505" -> "DUPLICATE";
            case "40001" -> "TRANSIENT";
            case "28000" -> "AUTH";
            default -> "UNKNOWN";
        };
    }
}
