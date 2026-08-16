import java.util.*;

public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check("1,2.5".equals(Main.joinUnknown(List.of(1, 2.5))), "join");
        List<Number> stock = new ArrayList<>();
        Main.addRestock(stock, 7);
        check(stock.equals(List.of(7)), "restock");
        check(Main.total(List.of(1, 2.5)) == 3.5, "total");
        System.out.println("PASS");
    }
}

