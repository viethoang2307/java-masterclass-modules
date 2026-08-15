public class SelfCheck {
    public static void main(String[] args) {
        Main.Stats stats = Main.statistics(new int[]{4, -2, 9, 1});
        check(stats.min() == -2 && stats.max() == 9 && stats.sum() == 12);
        check(Math.abs(stats.average() - 3.0) < 1e-9);
        expectFailure(() -> Main.statistics(new int[0]));
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
    static void expectFailure(Runnable action) { try { action.run(); throw new AssertionError(); } catch (IllegalArgumentException expected) { } }
}
