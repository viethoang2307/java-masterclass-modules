import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
public class Main {
    record Product(String sku, String name, Set<String> tags) {
        Product { tags = Set.copyOf(tags); }
    }
    static final class Catalog {
        private final Map<String,Product> bySku;
        private final Map<String,List<Product>> byTag;
        Catalog(Collection<Product> products) {
            if (products == null) throw new IllegalArgumentException("products is null");
            Map<String,Product> skuIndex = new HashMap<>();
            Map<String,List<Product>> tagIndex = new HashMap<>();
            for (Product source : products) {
                if (source == null || source.sku() == null || source.sku().isBlank() || source.name() == null || source.name().isBlank() || source.tags() == null) throw new IllegalArgumentException("invalid product");
                String sku = source.sku().strip().toUpperCase(Locale.ROOT);
                Set<String> tags = new HashSet<>();
                for (String tag : source.tags()) {
                    if (tag == null || tag.isBlank()) throw new IllegalArgumentException("invalid tag");
                    tags.add(tag.strip().toLowerCase(Locale.ROOT));
                }
                Product product = new Product(sku, source.name().strip(), tags);
                if (skuIndex.putIfAbsent(sku, product) != null) throw new IllegalArgumentException("duplicate sku");
                for (String tag : tags) tagIndex.computeIfAbsent(tag, ignored -> new ArrayList<>()).add(product);
            }
            Map<String,List<Product>> frozenTags = new HashMap<>();
            tagIndex.forEach((tag, list) -> {
                list.sort(Comparator.comparing(Product::sku));
                frozenTags.put(tag, List.copyOf(list));
            });
            bySku = Map.copyOf(skuIndex); byTag = Map.copyOf(frozenTags);
        }
        Product find(String sku) { return bySku.get(key(sku)); }
        List<Product> byTag(String tag) { return byTag.getOrDefault(tagKey(tag), List.of()); }
        int size() { return bySku.size(); }
        private static String key(String value) { if (value == null || value.isBlank()) throw new IllegalArgumentException("sku"); return value.strip().toUpperCase(Locale.ROOT); }
        private static String tagKey(String value) { if (value == null || value.isBlank()) throw new IllegalArgumentException("tag"); return value.strip().toLowerCase(Locale.ROOT); }
    }
}
