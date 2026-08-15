import java.util.ArrayList;
import java.util.List;
public class SelfCheck {
    public static void main(String[] args) {
        List<Long> ledger = new ArrayList<>();
        Main.append(ledger, 100, -25, 10);
        check(Main.balance(ledger) == 85 && ledger.equals(List.of(100L, -25L, 10L)));
        try { Main.balance(List.of(Long.MAX_VALUE, 1L)); throw new AssertionError(); } catch (ArithmeticException expected) { }
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
