public class Module05Example {
    interface DiscountPolicy { int apply(int subtotal); }
    static final class Order {
        private final int subtotal;
        private final DiscountPolicy policy;
        Order(int subtotal, DiscountPolicy policy) {
            if (subtotal < 0) throw new IllegalArgumentException("subtotal");
            this.subtotal = subtotal; this.policy = policy;
        }
        int total() { return subtotal - policy.apply(subtotal); }
    }
    public static void main(String[] args) {
        Order order = new Order(1000, subtotal -> subtotal >= 500 ? 100 : 0);
        System.out.println(order.total());
    }
}