import java.util.*;

public class Main {
    public static String joinUnknown(List<?> values) {
        return values.stream().map(String::valueOf).reduce((a, b) -> a + "," + b).orElse("");
    }

    public static void addRestock(List<? super Integer> stock, int amount) {
        if (amount < 0) throw new IllegalArgumentException("negative");
        stock.add(amount);
    }

    public static double total(List<? extends Number> values) {
        double result = 0;
        for (Number value : values) result += value.doubleValue();
        return result;
    }

    public static void main(String[] args) {
        List<Number> stock = new ArrayList<>();
        addRestock(stock, 5);
        System.out.println(joinUnknown(stock));
    }
}

