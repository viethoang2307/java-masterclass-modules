import java.math.*;
import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        check(Main.formatAmount(new BigDecimal("1234.5"), Locale.US).equals("1,234.50"), "US");
        check(Main.formatAmount(new BigDecimal("1234.5"), Locale.GERMANY).equals("1.234,50"), "Germany");
        System.out.println("PASS");
    }
}

