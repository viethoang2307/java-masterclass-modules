import java.util.List;
import java.util.Map;

public class SelfCheck {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> result = Main.frequencies(List.of("a", "b", "a", "c", "b", "a"));
        if (!Map.of("a", 3, "b", 2, "c", 1).equals(result)) throw new AssertionError(result);
        System.out.println("PASS");
    }
}
