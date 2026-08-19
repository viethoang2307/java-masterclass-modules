import java.math.*;
import java.time.*;
import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        Instant one = Instant.parse("2026-08-19T01:00:00Z");
        Instant two = Instant.parse("2026-08-19T02:00:00Z");
        Main.Line a = new Main.Line("a", 2, new BigDecimal("1.25"));
        Main.Line b = new Main.Line("b", 3, new BigDecimal("2.00"));
        Main.Report report = Main.analyze(List.of(
            new Main.Order("1", true, one, List.of(a)),
            new Main.Order("2", false, two, List.of(b)),
            new Main.Order("3", true, two, List.of(b))));
        check(report.orderCount() == 3 && report.paidOrders() == 2, "counts");
        check(report.revenue().compareTo(new BigDecimal("8.50")) == 0, "revenue");
        check(report.topSku().orElseThrow().equals("b"), "top sku");
        check(report.latestOrder().orElseThrow().equals(two), "latest");
        System.out.println("PASS");
    }
}

