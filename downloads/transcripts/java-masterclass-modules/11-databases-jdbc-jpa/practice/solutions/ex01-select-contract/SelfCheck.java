public class SelfCheck {
    public static void main(String[] args) {
        if (!"SELECT id, email FROM customer WHERE id = ?".equals(Main.query())) throw new AssertionError();
        System.out.println("PASS");
    }
}
