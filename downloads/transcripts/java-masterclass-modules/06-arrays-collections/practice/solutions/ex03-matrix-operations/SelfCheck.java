import java.util.Arrays;
public class SelfCheck {
    public static void main(String[] args) {
        check(Arrays.deepEquals(Main.transpose(new int[][]{{1,2,3},{4,5,6}}), new int[][]{{1,4},{2,5},{3,6}}));
        expectFailure(() -> Main.transpose(new int[][]{{1},{2,3}}));
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
    static void expectFailure(Runnable r) { try { r.run(); throw new AssertionError(); } catch (IllegalArgumentException expected) { } }
}
