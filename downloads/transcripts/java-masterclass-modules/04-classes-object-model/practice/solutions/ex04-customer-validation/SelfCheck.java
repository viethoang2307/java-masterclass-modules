public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Customer c = new Main.Customer(" An ", " Nguyen ", null);
        check(c.fullName().equals("An Nguyen"), "full name");
        check(c.email().equals(""), "default email");
        boolean first = false;
        try { new Main.Customer(" ", "N", "x"); } catch (IllegalArgumentException ex) { first = true; }
        check(first, "blank first");
        boolean last = false;
        try { new Main.Customer("A", null, "x"); } catch (IllegalArgumentException ex) { last = true; }
        check(last, "null last");
        System.out.println("PASS");
    }
}

