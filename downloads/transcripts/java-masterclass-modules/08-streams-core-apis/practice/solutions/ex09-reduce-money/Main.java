import java.math.*;
import java.util.*;

public class Main {
    public static BigDecimal total(List<String> amounts) {
        return amounts.stream()
            .map(BigDecimal::new)
            .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static BigDecimal roundedTotal(List<String> amounts) {
        return total(amounts).setScale(2, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        System.out.println(roundedTotal(List.of("1.10", "2.25")));
    }
}

