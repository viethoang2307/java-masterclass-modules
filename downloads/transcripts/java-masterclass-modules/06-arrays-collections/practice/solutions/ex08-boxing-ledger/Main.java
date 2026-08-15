import java.util.List;
public class Main {
    static void append(List<Long> ledger, long... transactions) {
        if (ledger == null || transactions == null) throw new IllegalArgumentException("null input");
        for (long transaction : transactions) ledger.add(transaction);
    }
    static long balance(List<Long> ledger) {
        if (ledger == null) throw new IllegalArgumentException("ledger is null");
        long total = 0;
        for (Long value : ledger) {
            if (value == null) throw new IllegalArgumentException("null transaction");
            total = Math.addExact(total, value);
        }
        return total;
    }
}
