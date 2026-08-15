public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Account a = new Main.Account(" A1 ", 100);
        check(a.id().equals("A1"), "id");
        check(a.deposit(50) && a.balance() == 150, "deposit");
        check(!a.withdraw(200) && a.balance() == 150, "overdraft");
        check(a.withdraw(25) && a.balance() == 125, "withdraw");
        boolean threw = false;
        try { new Main.Account("A2", -1); } catch (IllegalArgumentException ex) { threw = true; }
        check(threw, "negative opening");
        System.out.println("PASS");
    }
}

