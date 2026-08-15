public class Main {
    static abstract class Payment {
        private final long amount;
        Payment(long amount) { if (amount < 0) throw new IllegalArgumentException(); this.amount = amount; }
        final long amount() { return amount; }
        abstract String label();
        final String receipt() { return "label=" + label() + ";amount=" + amount; }
    }
    static final class CardPayment extends Payment {
        CardPayment(long amount) { super(amount); }
        @Override String label() { return "card"; }
    }
    static final class CashPayment extends Payment {
        CashPayment(long amount) { super(amount); }
        @Override String label() { return "cash"; }
    }
    public static void main(String[] args) { System.out.println(new CardPayment(100).receipt()); }
}

