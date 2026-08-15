import java.util.Arrays;
public class SelfCheck {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4};
        int[] result = Main.reverseCopy(source);
        check(Arrays.equals(result, new int[]{4, 3, 2, 1}));
        check(Arrays.equals(source, new int[]{1, 2, 3, 4}) && result != source);
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
