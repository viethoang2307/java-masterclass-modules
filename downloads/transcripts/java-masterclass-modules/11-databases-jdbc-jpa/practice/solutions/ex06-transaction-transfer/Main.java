public class Main {
    public static String transfer(long from, long to, long amount, boolean failAfterDebit) {
        long originalFrom = from;
        long originalTo = to;
        try {
            if (amount <= 0 || from < amount) throw new IllegalArgumentException("amount");
            from -= amount;
            if (failAfterDebit) throw new IllegalStateException("simulated failure");
            to += amount;
            return from + ":" + to;
        } catch (RuntimeException e) {
            return originalFrom + ":" + originalTo;
        }
    }
}
