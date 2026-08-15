import java.util.Arrays;

public class SelfCheck {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        check(Arrays.equals(Main.readTenValid("1 bad 2 3 4 5 6 7 8 9 10 11"),
                new int[]{1,2,3,4,5,6,7,8,9,10}), "ten valid");
        check(Arrays.equals(Main.readTenValid("4 5"), new int[]{4,5}), "early EOF");
        check(Arrays.equals(Main.readTenValid("a b"), new int[0]), "none valid");
        check(Arrays.equals(Main.readTenValid("1 2 3 4 5 6 7 8 9 10 11"), 
                new int[]{1,2,3,4,5,6,7,8,9,10}), "stop after ten");
        System.out.println("PASS");
    }
}
