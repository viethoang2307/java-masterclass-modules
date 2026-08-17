import java.util.*;
import java.util.function.*;

public class Main {
    public interface Identifiable { String id(); }

    public static final class Repository<T extends Identifiable> {
        private final Map<String, T> data = new LinkedHashMap<>();

        public Repository(Collection<? extends T> initial) {
            for (T item : initial) {
                if (data.put(item.id(), item) != null) throw new IllegalArgumentException("duplicate id");
            }
        }

        public Optional<T> find(Predicate<? super T> rule) {
            return data.values().stream().filter(rule).findFirst();
        }

        public List<T> query(Query<T> query) {
            List<T> result = new ArrayList<>(data.values());
            result.removeIf(query.filter.negate());
            if (query.order != null) result.sort(query.order);
            if (query.limit >= 0 && result.size() > query.limit)
                result = new ArrayList<>(result.subList(0, query.limit));
            return List.copyOf(result);
        }

        public static final class Query<T> {
            private Predicate<? super T> filter = value -> true;
            private Comparator<? super T> order;
            private int limit = -1;
            public Query<T> where(Predicate<? super T> value) {
                Predicate<? super T> previous = filter;
                filter = item -> previous.test(item) && value.test(item);
                return this;
            }
            public Query<T> orderBy(Comparator<? super T> value) { order = value; return this; }
            public Query<T> limit(int value) {
                if (value < 0) throw new IllegalArgumentException("limit");
                limit = value; return this;
            }
        }
    }

    public record Product(String id, String name, int stock) implements Identifiable {}

    public static void main(String[] args) {
        Repository<Product> repository = new Repository<>(List.of(new Product("a", "A", 2)));
        System.out.println(repository.find(product -> product.stock() > 0));
    }
}
