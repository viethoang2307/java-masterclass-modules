import java.math.*;
import java.time.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public record Line(String sku, int quantity, BigDecimal unitPrice) {}
    public record Order(String id, boolean paid, Instant createdAt, List<Line> lines) {
        public Order { lines = List.copyOf(lines); }
    }
    public record Report(long orderCount, long paidOrders, BigDecimal revenue,
                         Optional<String> topSku, Optional<Instant> latestOrder) {}

    public static Report analyze(List<Order> orders) {
        List<Order> paid = orders.stream().filter(Order::paid).toList();
        BigDecimal revenue = paid.stream().flatMap(order -> order.lines().stream())
            .map(line -> line.unitPrice().multiply(BigDecimal.valueOf(line.quantity())))
            .reduce(BigDecimal.ZERO, BigDecimal::add);
        Map<String, Integer> quantities = paid.stream()
            .flatMap(order -> order.lines().stream())
            .collect(Collectors.groupingBy(Line::sku, Collectors.summingInt(Line::quantity)));
        Optional<String> topSku = quantities.entrySet().stream()
            .sorted(Comparator.comparingInt((Map.Entry<String, Integer> e) -> e.getValue())
                .reversed().thenComparing(Map.Entry::getKey))
            .map(Map.Entry::getKey).findFirst();
        Optional<Instant> latest = orders.stream().map(Order::createdAt).max(Comparator.naturalOrder());
        return new Report(orders.size(), paid.size(), revenue, topSku, latest);
    }

    public static void main(String[] args) {
        System.out.println(analyze(List.of()));
    }
}

