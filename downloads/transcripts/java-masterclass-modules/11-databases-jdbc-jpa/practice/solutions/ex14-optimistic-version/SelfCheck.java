public class SelfCheck {
    public static void main(String[] args) {
        if (!"OK:2".equals(Main.update(1, "new"))) throw new AssertionError();
        if (!"CONFLICT".equals(Main.update(0, "stale"))) throw new AssertionError();
        System.out.println("PASS");
    }
}
