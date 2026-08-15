public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Payment card = new Main.CardPayment(100);
        Main.Payment cash = new Main.CashPayment(50);
        check(card.receipt().equals("label=card;amount=100"), "card");
        check(cash.receipt().equals("label=cash;amount=50"), "cash");
        boolean threw=false; try { new Main.CardPayment(-1); } catch (IllegalArgumentException ex) { threw=true; }
        check(threw, "negative");
        System.out.println("PASS");
    }
}

