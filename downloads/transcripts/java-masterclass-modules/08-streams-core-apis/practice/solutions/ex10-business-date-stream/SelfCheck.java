import java.time.*;
import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        LocalDate friday = LocalDate.of(2026, 8, 21);
        check(Main.nextBusinessDay(friday, Set.of()).equals(LocalDate.of(2026, 8, 24)), "weekend");
        check(Main.days(LocalDate.of(2026, 8, 19), 3).size() == 3, "finite stream");
        System.out.println("PASS");
    }
}

