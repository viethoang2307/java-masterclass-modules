import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class Main {
    enum Category { BOOK, TOOL, COURSE }
    record Product(String sku, Category category, long priceCents, Set<String> tags) { Product { tags = Set.copyOf(tags); } }
    record Request(String sku, int quantity) {}
    record Line(String sku, int quantity, long subtotalCents) {}
    record Receipt(List<Line> lines, long totalCents, Map<Category,Integer> categoryQuantities, Set<String> tags) {
        Receipt { lines = List.copyOf(lines); categoryQuantities = Map.copyOf(categoryQuantities); tags = Set.copyOf(tags); }
    }
    static final class Engine {
        private final Map<String,Product> catalog = new HashMap<>();
        private final Map<String,Integer> inventory = new HashMap<>();
        void register(Product source, int stock) {
            if (source == null || source.category() == null || source.priceCents() < 0 || source.tags() == null || stock < 0) throw new IllegalArgumentException("invalid product");
            String sku = key(source.sku()); Set<String> tags = new HashSet<>();
            for (String tag : source.tags()) { if (tag == null || tag.isBlank()) throw new IllegalArgumentException("tag"); tags.add(tag.strip().toLowerCase(Locale.ROOT)); }
            Product product = new Product(sku, source.category(), source.priceCents(), tags);
            if (catalog.putIfAbsent(sku, product) != null) throw new IllegalArgumentException("duplicate sku");
            inventory.put(sku, stock);
        }
        Receipt placeOrder(List<Request> requests) {
            if (requests == null || requests.isEmpty()) throw new IllegalArgumentException("empty order");
            Map<String,Integer> aggregated = new TreeMap<>();
            for (Request request : requests) {
                if (request == null || request.quantity() <= 0) throw new IllegalArgumentException("request");
                String sku = key(request.sku()); if (!catalog.containsKey(sku)) throw new IllegalArgumentException("unknown sku");
                aggregated.merge(sku, request.quantity(), Math::addExact);
            }
            List<Line> lines = new ArrayList<>(); Set<String> tags = new HashSet<>();
            EnumMap<Category,Integer> counts = new EnumMap<>(Category.class); for (Category c : Category.values()) counts.put(c, 0);
            long total = 0;
            for (Map.Entry<String,Integer> entry : aggregated.entrySet()) {
                String sku = entry.getKey(); int quantity = entry.getValue();
                if (inventory.get(sku) < quantity) throw new IllegalArgumentException("insufficient stock");
                Product product = catalog.get(sku); long subtotal = Math.multiplyExact(product.priceCents(), quantity);
                total = Math.addExact(total, subtotal); lines.add(new Line(sku, quantity, subtotal));
                counts.merge(product.category(), quantity, Math::addExact); tags.addAll(product.tags());
            }
            aggregated.forEach((sku, quantity) -> inventory.put(sku, inventory.get(sku) - quantity));
            return new Receipt(lines, total, counts, tags);
        }
        int stock(String sku) { return inventory.getOrDefault(key(sku), 0); }
        private static String key(String sku) { if (sku == null || sku.isBlank()) throw new IllegalArgumentException("sku"); return sku.strip().toUpperCase(Locale.ROOT); }
    }
}
