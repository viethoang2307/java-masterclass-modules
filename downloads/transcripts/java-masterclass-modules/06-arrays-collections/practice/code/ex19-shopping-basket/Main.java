import java.util.List;
public class Main {
    record Line(String sku, int quantity, long subtotalCents) {}
    record Receipt(List<Line> lines, long totalCents) {}
    static final class Store {
        void register(String sku, long priceCents, int stock) { /* TODO */ }
        boolean addToBasket(String sku, int quantity) { return false; /* TODO */ }
        void removeFromBasket(String sku, int quantity) { /* TODO */ }
        int available(String sku) { return 0; /* TODO */ }
        int inBasket(String sku) { return 0; /* TODO */ }
        Receipt checkout() { return null; /* TODO */ }
    }
}
