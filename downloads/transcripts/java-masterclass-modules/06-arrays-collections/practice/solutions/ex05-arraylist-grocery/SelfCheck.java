import java.util.ArrayList;
import java.util.List;
public class SelfCheck {
    public static void main(String[] args) {
        List<String> source = new ArrayList<>(List.of(" Apple ", "milk", "APPLE", "  ", "Bread"));
        List<String> result = Main.normalizeGroceries(source);
        check(result.equals(List.of("Apple", "milk", "Bread")) && source.size() == 5);
        try { result.add("x"); throw new AssertionError(); } catch (UnsupportedOperationException expected) { }
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
