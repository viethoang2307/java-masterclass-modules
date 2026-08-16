import java.util.*;

public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        List<Number> numbers = Main.flatten(List.of(1, 2), List.of(3.5));
        check(numbers.equals(List.of(1, 2, 3.5)), "flatten variance");
        String[] copy = Main.copyWithFactory(new String[]{"a", "b"}, String[]::new);
        check(Arrays.equals(copy, new String[]{"a", "b"}), "array factory");
        System.out.println("PASS");
    }
}

