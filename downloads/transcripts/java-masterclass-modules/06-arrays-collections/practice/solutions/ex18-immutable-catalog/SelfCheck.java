import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class SelfCheck {
    public static void main(String[] args) {
        Set<String> tags = new HashSet<>(Set.of(" Java ", "BOOK"));
        List<Main.Product> input = new ArrayList<>();
        input.add(new Main.Product(" j17 ", "Java 17", tags)); input.add(new Main.Product("algo", "Algorithms", Set.of("book")));
        Main.Catalog catalog = new Main.Catalog(input); tags.add("mutated"); input.clear();
        check(catalog.size() == 2 && catalog.find("J17").tags().equals(Set.of("java","book")));
        check(catalog.byTag(" BOOK ").stream().map(Main.Product::sku).toList().equals(List.of("ALGO","J17")));
        check(catalog.byTag("mutated").isEmpty());
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
