import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        check(Main.total(List.of("0.10", "0.20")).compareTo(new java.math.BigDecimal("0.30")) == 0, "exact");
        check(Main.roundedTotal(List.of("1.005")).compareTo(new java.math.BigDecimal("1.01")) == 0, "round");
        check(Main.total(List.of()).equals(java.math.BigDecimal.ZERO), "identity");
        System.out.println("PASS");
    }
}

