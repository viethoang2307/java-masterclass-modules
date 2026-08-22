public class Main {
    static String userCode(String kind) {
        return switch (kind == null ? "" : kind) {
            case "input" -> "INVALID_INPUT";
            case "not-found" -> "NOT_FOUND";
            case "conflict" -> "CONFLICT";
            case "infrastructure" -> "UNAVAILABLE";
            default -> "INTERNAL_ERROR";
        };
    }
}
