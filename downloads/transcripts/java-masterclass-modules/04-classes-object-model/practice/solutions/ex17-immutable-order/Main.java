import java.util.List;

public class Main {
    static final class Order {
        private final String id;
        private final List<String> items;

        Order(String id, List<String> items) {
            if (id == null || id.isBlank() || items == null) throw new IllegalArgumentException();
            this.id = id.strip();
            this.items = List.copyOf(items);
        }

        String id() { return id; }
        List<String> items() { return items; }
        int totalItems() { return items.size(); }
    }

    public static void main(String[] args) {
        System.out.println(new Order("O1", List.of("book")).totalItems());
    }
}

