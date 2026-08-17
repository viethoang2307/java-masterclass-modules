import java.util.*;
import java.util.stream.Collectors;

public class Module08Example {
    record Sale(String category, int amount) {}
    public static void main(String[] args) {
        List<Sale> sales = List.of(new Sale("book", 10),
            new Sale("book", 15), new Sale("game", 30));
        Map<String, Integer> totals = sales.stream().collect(
            Collectors.groupingBy(Sale::category, LinkedHashMap::new,
                Collectors.summingInt(Sale::amount)));
        System.out.println(totals);
        System.out.println(sales.stream().mapToInt(Sale::amount).max().orElse(0));
    }
}