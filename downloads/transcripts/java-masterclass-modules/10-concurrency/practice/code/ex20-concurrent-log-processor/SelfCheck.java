import java.util.List;
import java.util.Map;

public class SelfCheck {
    public static void main(String[] args) throws Exception {
        List<String> lines = List.of("INFO boot", "ERROR disk", "WARN retry", "bad", "INFO ready", "ERROR timeout");
        Map<String, Integer> expected = Map.of("INFO", 2, "WARN", 1, "ERROR", 2);
        if (!expected.equals(Main.process(lines))) throw new AssertionError(Main.process(lines));
        System.out.println("PASS");
    }
}
