public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.audit(), "audit");
        Main.Email a = new Main.Email(" A@X.COM ");
        check(a.value().equals("a@x.com"), "normalize");
        check(a.toString().equals("Email[a@x.com]"), "toString");
        boolean threw = false;
        try { new Main.Email(" "); } catch (IllegalArgumentException ex) { threw = true; }
        check(threw, "blank");
        System.out.println("PASS");
    }
}

