import java.util.*;

public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        int count = Main.transfer(objects, List.of("a", "b"));
        check(count == 2 && objects.equals(List.of("a", "b")), "object target");
        List<Number> numbers = new ArrayList<>();
        Main.transfer(numbers, List.of(1, 2));
        check(numbers.equals(List.of(1, 2)), "number target");
        check(Main.snapshot(List.of("x", "y")).equals(List.of("x", "y")), "snapshot");
        System.out.println("PASS");
    }
}

