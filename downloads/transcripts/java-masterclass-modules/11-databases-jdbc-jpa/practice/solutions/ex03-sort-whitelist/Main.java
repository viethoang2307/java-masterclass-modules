public class Main {
    public static String sortSql(String input) {
        return switch (input) {
            case "name" -> "ORDER BY name ASC";
            case "created" -> "ORDER BY created_at ASC";
            default -> throw new IllegalArgumentException("unsupported sort");
        };
    }
}
