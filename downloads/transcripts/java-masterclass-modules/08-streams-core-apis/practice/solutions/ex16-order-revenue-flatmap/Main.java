import java.math.*;
import java.util.*;

public class Main {
    public record Line(String sku, int quantity, BigDecimal unitPrice) {}
    public record Order(boolean paid, List<Line> lines) {
        public Order { lines = List.copyOf(lines); }
    }

    public static BigDecimal paidRevenue(List<Order> orders) {
        return orders.stream()
            .filter(Order::paid)
            .flatMap(order -> order.lines().stream())
            .map(line -> line.unitPrice().multiply(BigDecimal.valueOf(line.quantity())))
            .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static void main(String[] args) {
        System.out.println(paidRevenue(List.of()));
    }
}

