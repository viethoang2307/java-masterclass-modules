import java.math.BigDecimal;
import java.util.function.UnaryOperator;

public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(new BigDecimal("17.99").equals(
            Main.priceAfterDiscount(new BigDecimal("19.99"), 10)), "discount");
        UnaryOperator<BigDecimal> half = Main.discount(50);
        check(new BigDecimal("5.00").equals(half.apply(new BigDecimal("10"))), "capture");
        boolean failed = false;
        try { Main.discount(101); } catch (IllegalArgumentException expected) { failed = true; }
        check(failed, "percent");
        System.out.println("PASS");
    }
}

