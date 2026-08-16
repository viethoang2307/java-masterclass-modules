import java.util.*;

public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        List<String> values = new ArrayList<>(List.of("a", "b", "c"));
        Main.swap(values, 0, 2);
        check(values.equals(List.of("c", "b", "a")), "swap");
        List<Number> target = new ArrayList<>();
        Main.copyTo(target, List.of(1, 2, 3));
        check(target.equals(List.of(1, 2, 3)), "PECS copy");
        System.out.println("PASS");
    }
}

