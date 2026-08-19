import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public record Order(String id, String status, BigDecimal amount) {}

    public static Map<String, Long> countByStatus(List<Order> orders) {
        return orders.stream().collect(Collectors.groupingBy(
            Order::status, LinkedHashMap::new, Collectors.counting()));
    }

    public static void main(String[] args) {
        System.out.println(countByStatus(List.of(
            new Order("1", "PAID", new BigDecimal("2.00")))));
    }
}

