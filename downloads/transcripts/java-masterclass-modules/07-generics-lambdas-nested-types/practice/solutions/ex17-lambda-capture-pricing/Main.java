import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.UnaryOperator;

public class Main {
    public static UnaryOperator<BigDecimal> discount(int percent) {
        if (percent < 0 || percent > 100) throw new IllegalArgumentException("percent");
        final BigDecimal factor = BigDecimal.valueOf(100 - percent)
            .movePointLeft(2);
        return amount -> amount.multiply(factor).setScale(2, RoundingMode.HALF_UP);
    }

    public static BigDecimal priceAfterDiscount(BigDecimal amount, int percent) {
        return discount(percent).apply(amount);
    }

    public static void main(String[] args) {
        System.out.println(priceAfterDiscount(new BigDecimal("19.99"), 10));
    }
}

