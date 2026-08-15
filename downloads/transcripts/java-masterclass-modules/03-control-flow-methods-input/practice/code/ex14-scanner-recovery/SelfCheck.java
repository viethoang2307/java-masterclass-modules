import java.util.Arrays;

public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Arrays.equals(Main.readValidInts("10 nope -2 30"), new int[]{10, -2, 30}), "mixed");
        check(Arrays.equals(Main.readValidInts("x y"), new int[0]), "all invalid");
        check(Arrays.equals(Main.readValidInts(null), new int[0]), "null");
        check(Arrays.equals(Main.readValidInts("1 2 3"), new int[]{1, 2, 3}), "order");
        System.out.println("PASS");
    }
}
