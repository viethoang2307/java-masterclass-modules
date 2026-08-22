public class Main {
    public static String sql() {
        return "INSERT INTO customer(email, created_at) VALUES (?, ?)";
    }
    public static int parameterCount() { return 2; }
}
