import java.util.*;

public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Product a = new Main.Product("a", "A", 2);
        Main.Product b = new Main.Product("b", "B", 5);
        Main.Repository<Main.Product> repo = new Main.Repository<>(List.of(a, b));
        check(repo.find(product -> product.stock() == 5).orElseThrow().equals(b), "find");
        Main.Repository.Query<Main.Product> query = new Main.Repository.Query<Main.Product>()
            .where(product -> product.stock() > 0)
            .orderBy(Comparator.comparingInt(Main.Product::stock).reversed())
            .limit(1);
        check(repo.query(query).equals(List.of(b)), "query");
        boolean failed = false;
        try { new Main.Repository<>(List.of(a, a)); } catch (IllegalArgumentException expected) { failed = true; }
        check(failed, "duplicate");
        System.out.println("PASS");
    }
}

