public class Main {
    static final class Product {
        private final String name;
        private final int price;
        private int stock;

        Product(String name) { this(name, 0, 0); }
        Product(String name, int price) { this(name, price, 0); }
        Product(String name, int price, int stock) {
            if (name == null || name.isBlank() || price < 0 || stock < 0) {
                throw new IllegalArgumentException();
            }
            this.name = name.trim();
            this.price = price;
            this.stock = stock;
        }

        String name() { return name; }
        int price() { return price; }
        int stock() { return stock; }
    }

    public static void main(String[] args) {
        System.out.println(new Product("Pen").name());
    }
}

