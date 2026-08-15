import java.util.List;
public class SelfCheck {
    public static void main(String[] args) {
        Main.Store store = new Main.Store(); store.register("JAVA", 1250, 5); store.register("GIT", 800, 2);
        check(store.addToBasket(" java ", 3) && store.available("JAVA") == 2);
        check(!store.addToBasket("JAVA", 3) && store.available("JAVA") == 2 && store.inBasket("JAVA") == 3);
        store.removeFromBasket("JAVA", 1); check(store.available("JAVA") == 3 && store.inBasket("JAVA") == 2);
        store.addToBasket("GIT", 1); Main.Receipt receipt = store.checkout();
        check(receipt.totalCents() == 3300 && receipt.lines().stream().map(Main.Line::sku).toList().equals(List.of("JAVA","GIT")));
        check(store.inBasket("JAVA") == 0 && store.available("JAVA") == 3);
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
