public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Staff staff = new Main.Staff(" An ", " dev ");
        check(staff.label().equals("An (dev)"), "super label");
        boolean threw = false;
        try { new Main.Staff("A", " "); } catch (IllegalArgumentException ex) { threw = true; }
        check(threw, "invalid role");
        System.out.println("PASS");
    }
}

