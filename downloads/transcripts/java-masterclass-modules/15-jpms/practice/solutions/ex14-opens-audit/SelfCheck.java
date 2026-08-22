public class SelfCheck {
    public static void main(String[] args) {
        String d = "exports com.acme.api; opens com.acme.entity to orm, testkit; opens com.acme.config;";
        check(Main.needsOpen(d, "com.acme.entity", "orm"));
        check(Main.needsOpen(d, "com.acme.entity", "testkit"));
        check(Main.needsOpen(d, "com.acme.config", "any"));
        check(!Main.needsOpen(d, "com.acme.api", "orm"));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
