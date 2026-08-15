import java.util.Collection;
import java.util.List;
import java.util.Set;
public class Main {
    record Product(String sku, String name, Set<String> tags) {}
    static final class Catalog {
        Catalog(Collection<Product> products) { /* TODO: normalize, copy and build indexes. */ }
        Product find(String sku) { return null; /* TODO */ }
        List<Product> byTag(String tag) { return List.of(); /* TODO */ }
        int size() { return 0; /* TODO */ }
    }
}
