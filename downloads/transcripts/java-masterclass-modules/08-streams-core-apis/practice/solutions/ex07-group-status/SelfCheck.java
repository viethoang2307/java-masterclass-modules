import java.math.*;
import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        List<Main.Order> orders = List.of(
            new Main.Order("1", "PAID", new BigDecimal("2")),
            new Main.Order("2", "NEW", new BigDecimal("3")),
            new Main.Order("3", "PAID", new BigDecimal("4")));
        Map<String, Long> result = Main.countByStatus(orders);
        check(result.equals(Map.of("PAID", 2L, "NEW", 1L)), "group");
        check(new ArrayList<>(result.keySet()).equals(List.of("PAID", "NEW")), "order");
        System.out.println("PASS");
    }
}

