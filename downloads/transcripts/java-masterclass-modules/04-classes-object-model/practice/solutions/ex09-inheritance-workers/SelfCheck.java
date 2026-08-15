public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Worker a = new Main.Employee("An", 1000);
        Main.Worker b = new Main.Contractor("Binh", 20, 10);
        check(a.pay() == 1000, "employee");
        check(b.pay() == 200, "contractor");
        check(Main.totalPay(a, b) == 1200, "polymorphic total");
        boolean threw = false;
        try { new Main.Contractor("X", -1, 2); } catch (IllegalArgumentException ex) { threw = true; }
        check(threw, "invalid rate");
        System.out.println("PASS");
    }
}

