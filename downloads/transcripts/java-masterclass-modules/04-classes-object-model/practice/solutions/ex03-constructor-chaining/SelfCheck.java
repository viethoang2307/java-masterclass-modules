public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Product a = new Main.Product("Pen");
        check(a.price() == 0 && a.stock() == 0, "defaults");
        Main.Product b = new Main.Product("Book", 10);
        check(b.price() == 10 && b.stock() == 0, "two args");
        Main.Product c = new Main.Product("Bag", 20, 3);
        check(c.stock() == 3, "canonical");
        boolean threw = false;
        try { new Main.Product("x", -1, 0); } catch (IllegalArgumentException ex) { threw = true; }
        check(threw, "invalid");
        System.out.println("PASS");
    }
}

