import java.math.*;
import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        Main.Line a = new Main.Line("a", 2, new BigDecimal("1.25"));
        Main.Line b = new Main.Line("b", 1, new BigDecimal("3.00"));
        BigDecimal result = Main.paidRevenue(List.of(
            new Main.Order(true, List.of(a)), new Main.Order(false, List.of(b))));
        check(result.compareTo(new BigDecimal("2.50")) == 0, "paid revenue");
        System.out.println("PASS");
    }
}

