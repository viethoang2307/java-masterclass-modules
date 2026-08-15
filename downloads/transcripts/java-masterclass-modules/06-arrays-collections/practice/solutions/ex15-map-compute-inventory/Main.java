import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
public class Main {
    static final class Inventory {
        private final Map<String,Integer> stock = new HashMap<>();
        void receive(String sku, int quantity) {
            String key = key(sku); if (quantity <= 0) throw new IllegalArgumentException("quantity");
            stock.merge(key, quantity, Math::addExact);
        }
        boolean consume(String sku, int quantity) {
            String key = key(sku); if (quantity <= 0) throw new IllegalArgumentException("quantity");
            int current = stock.getOrDefault(key, 0);
            if (current < quantity) return false;
            stock.computeIfPresent(key, (ignored, value) -> value == quantity ? null : value - quantity);
            return true;
        }
        int quantity(String sku) { return stock.getOrDefault(key(sku), 0); }
        Map<String,Integer> snapshot() { return Collections.unmodifiableMap(new TreeMap<>(stock)); }
        private static String key(String sku) {
            if (sku == null || sku.isBlank()) throw new IllegalArgumentException("sku");
            return sku.strip().toUpperCase(Locale.ROOT);
        }
    }
}
