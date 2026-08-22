public class SelfCheck {
    public static void main(String[] args) {
        if (!"INSERT INTO customer(email, created_at) VALUES (?, ?)".equals(Main.sql()) || Main.parameterCount() != 2) throw new AssertionError();
        System.out.println("PASS");
    }
}
