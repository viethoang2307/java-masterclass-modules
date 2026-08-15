public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Worker a = new Main.Employee("An", 1000);
        Main.Worker b = new Main.Hourly("Binh", 20, 10);
        check(a.pay() == 1000 && b.pay() == 200, "pay");
        check(Main.totalPay(a, b) == 1200, "polymorphic total");
        System.out.println("PASS");
    }
}

