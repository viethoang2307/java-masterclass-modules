public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        Main.Stats stats = Main.summarize(new int[]{2, 4, 6});
        check(stats.sum() == 12 && stats.min() == 2 && stats.max() == 6, "stats");
        check(stats.average() == 4.0, "average");
        boolean failed = false;
        try { Main.summarize(new int[0]); } catch (IllegalArgumentException expected) { failed = true; }
        check(failed, "empty");
        System.out.println("PASS");
    }
}

