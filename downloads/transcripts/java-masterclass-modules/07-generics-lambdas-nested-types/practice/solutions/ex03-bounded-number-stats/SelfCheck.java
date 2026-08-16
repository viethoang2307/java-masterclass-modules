import java.math.BigDecimal;
import java.util.*;

public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.average(List.of(2, 4, 6)) == 4.0, "integer average");
        check(Math.abs(Main.average(List.of(1.5, 2.5)) - 2.0) < 1e-9, "double average");
        check(Main.maxAsDouble(List.of(new BigDecimal("3.2"), new BigDecimal("4.1"))) == 4.1, "max");
        boolean failed = false;
        try { Main.average(List.of()); } catch (IllegalArgumentException expected) { failed = true; }
        check(failed, "empty policy");
        System.out.println("PASS");
    }
}

