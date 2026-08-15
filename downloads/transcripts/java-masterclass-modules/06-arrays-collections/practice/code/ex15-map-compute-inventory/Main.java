import java.util.Map;
public class Main {
    static final class Inventory {
        void receive(String sku, int quantity) { /* TODO */ }
        boolean consume(String sku, int quantity) { return false; /* TODO */ }
        int quantity(String sku) { return 0; /* TODO */ }
        Map<String,Integer> snapshot() { return Map.of(); /* TODO */ }
    }
}
