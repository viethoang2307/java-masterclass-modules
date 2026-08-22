public class SelfCheck {
    public static void main(String[] args) {
        if (!"ORDER BY name ASC".equals(Main.sortSql("name"))) throw new AssertionError();
        try { Main.sortSql("name desc; drop table customer"); throw new AssertionError(); }
        catch (IllegalArgumentException expected) { }
        System.out.println("PASS");
    }
}
