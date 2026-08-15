import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class Main {
    static final class Product {
        private final String sku;
        private final int price;
        Product(String sku, int price) {
            if (sku == null || sku.isBlank() || price < 0) throw new IllegalArgumentException();
            this.sku = sku.strip();
            this.price = price;
        }
        String sku() { return sku; }
        int price() { return price; }
    }

    static final class Catalog {
        private final Map<String, Product> products = new HashMap<>();
        boolean add(String sku, int price) {
            try {
                Product product = new Product(sku, price);
                products.put(product.sku(), product);
                return true;
            } catch (IllegalArgumentException ex) {
                return false;
            }
        }
        Product find(String sku) { return products.get(sku); }
    }

    static final class Order {
        private final java.util.List<Product> items = new java.util.ArrayList<>();
        void add(Product product) { if (product != null) items.add(product); }
        String report() {
            Set<String> distinct = new HashSet<>();
            long total = 0;
            for (Product product : items) {
                distinct.add(product.sku());
                total += product.price();
            }
            return "items=" + items.size() + ";distinct=" + distinct.size() + ";total=" + total;
        }
    }

    static String run(String input) {
        Catalog catalog = new Catalog();
        Order order = new Order();
        Scanner scanner = new Scanner(input == null ? "" : input);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().strip();
            if (line.equalsIgnoreCase("REPORT")) break;
            String[] parts = line.split("\\s+");
            if (parts.length == 3 && parts[0].equalsIgnoreCase("ADD")) {
                try { catalog.add(parts[1], Integer.parseInt(parts[2])); }
                catch (NumberFormatException ignored) { }
            } else if (parts.length == 2 && parts[0].equalsIgnoreCase("BUY")) {
                order.add(catalog.find(parts[1]));
            }
        }
        return order.report();
    }

    public static void main(String[] args) {
        System.out.println(run("ADD A 10\nADD B 25\nBUY A\nREPORT\n"));
    }
}

