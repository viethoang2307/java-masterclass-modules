import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
public class Main {
    record Line(String sku, int quantity, long subtotalCents) {}
    record Receipt(List<Line> lines, long totalCents) { Receipt { lines = List.copyOf(lines); } }
    static final class Store {
        private final Map<String,Long> prices = new HashMap<>();
        private final Map<String,Integer> stock = new HashMap<>();
        private final Map<String,Integer> basket = new LinkedHashMap<>();
        void register(String sku, long priceCents, int quantity) {
            String key = key(sku); if (priceCents < 0 || quantity < 0 || prices.containsKey(key)) throw new IllegalArgumentException("invalid product");
            prices.put(key, priceCents); stock.put(key, quantity);
        }
        boolean addToBasket(String sku, int quantity) {
            String key = known(sku); if (quantity <= 0) throw new IllegalArgumentException("quantity");
            int available = stock.get(key); if (available < quantity) return false;
            int newBasket = Math.addExact(basket.getOrDefault(key, 0), quantity);
            stock.put(key, available - quantity); basket.put(key, newBasket); return true;
        }
        void removeFromBasket(String sku, int quantity) {
            String key = known(sku); if (quantity <= 0 || basket.getOrDefault(key, 0) < quantity) throw new IllegalArgumentException("quantity");
            int held = basket.get(key); stock.put(key, Math.addExact(stock.get(key), quantity));
            if (held == quantity) basket.remove(key); else basket.put(key, held - quantity);
        }
        int available(String sku) { return stock.getOrDefault(key(sku), 0); }
        int inBasket(String sku) { return basket.getOrDefault(key(sku), 0); }
        Receipt checkout() {
            List<Line> lines = new ArrayList<>(); long total = 0;
            for (Map.Entry<String,Integer> entry : basket.entrySet()) {
                long subtotal = Math.multiplyExact(prices.get(entry.getKey()), entry.getValue());
                total = Math.addExact(total, subtotal); lines.add(new Line(entry.getKey(), entry.getValue(), subtotal));
            }
            Receipt receipt = new Receipt(lines, total); basket.clear(); return receipt;
        }
        private String known(String sku) { String key = key(sku); if (!prices.containsKey(key)) throw new IllegalArgumentException("unknown sku"); return key; }
        private static String key(String sku) { if (sku == null || sku.isBlank()) throw new IllegalArgumentException("sku"); return sku.strip().toUpperCase(Locale.ROOT); }
    }
}
