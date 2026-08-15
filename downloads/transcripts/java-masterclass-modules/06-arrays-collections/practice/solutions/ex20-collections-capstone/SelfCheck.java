import java.util.List;
import java.util.Set;
public class SelfCheck {
    public static void main(String[] args) {
        Main.Engine engine = new Main.Engine();
        engine.register(new Main.Product("J17", Main.Category.BOOK, 1000, Set.of("java","jvm")), 5);
        engine.register(new Main.Product("GIT", Main.Category.TOOL, 500, Set.of("tool")), 2);
        Main.Receipt receipt = engine.placeOrder(List.of(new Main.Request("git",1), new Main.Request("J17",2), new Main.Request(" j17 ",1)));
        check(receipt.totalCents() == 3500 && receipt.lines().stream().map(Main.Line::sku).toList().equals(List.of("GIT","J17")));
        check(receipt.categoryQuantities().get(Main.Category.BOOK) == 3 && receipt.categoryQuantities().get(Main.Category.COURSE) == 0);
        check(receipt.tags().equals(Set.of("java","jvm","tool")) && engine.stock("J17") == 2);
        try { engine.placeOrder(List.of(new Main.Request("J17",3), new Main.Request("GIT",3))); throw new AssertionError(); } catch (IllegalArgumentException expected) { }
        check(engine.stock("J17") == 2 && engine.stock("GIT") == 1);
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
