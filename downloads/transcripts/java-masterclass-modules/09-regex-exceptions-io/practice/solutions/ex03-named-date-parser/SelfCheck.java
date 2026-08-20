import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        check(Main.parse("2026-08-20").orElseThrow().equals(java.time.LocalDate.of(2026, 8, 20)), "valid");
        check(Main.parse("2026-02-30").isEmpty(), "calendar");
        check(Main.parse("20-08-2026").isEmpty(), "shape");
        System.out.println("PASS");
    }
}

