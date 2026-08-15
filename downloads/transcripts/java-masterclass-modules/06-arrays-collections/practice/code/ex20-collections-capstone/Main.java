import java.util.List;
import java.util.Map;
import java.util.Set;
public class Main {
    enum Category { BOOK, TOOL, COURSE }
    record Product(String sku, Category category, long priceCents, Set<String> tags) {}
    record Request(String sku, int quantity) {}
    record Line(String sku, int quantity, long subtotalCents) {}
    record Receipt(List<Line> lines, long totalCents, Map<Category,Integer> categoryQuantities, Set<String> tags) {}
    static final class Engine {
        void register(Product product, int stock) { /* TODO */ }
        Receipt placeOrder(List<Request> requests) { return null; /* TODO: aggregate, validate all, then commit. */ }
        int stock(String sku) { return 0; /* TODO */ }
    }
}
