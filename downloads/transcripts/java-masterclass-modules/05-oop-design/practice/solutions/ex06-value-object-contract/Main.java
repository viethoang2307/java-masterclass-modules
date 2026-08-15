public class Main {
    static final class Money {
        private final String currency;
        private final long cents;
        Money(String currency, long cents) {
            if (currency == null || currency.isBlank() || cents < 0) throw new IllegalArgumentException();
            this.currency=currency.strip().toUpperCase(java.util.Locale.ROOT); this.cents=cents;
        }
        @Override public boolean equals(Object other) { return other instanceof Money m && cents==m.cents && currency.equals(m.currency); }
        @Override public int hashCode() { return java.util.Objects.hash(currency,cents); }
        @Override public String toString() { return currency + ":" + cents; }
    }
    public static void main(String[] args) { System.out.println(new Money("usd",150)); }
}

