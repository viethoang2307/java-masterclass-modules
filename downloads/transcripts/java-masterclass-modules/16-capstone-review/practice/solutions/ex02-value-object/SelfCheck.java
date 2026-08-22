public class SelfCheck {
    public static void main(String[] args) {
        check(Main.normalizeArtist("  Hà Nội  ").equals("Hà Nội"));
        expectFailure(() -> Main.normalizeArtist(null));
        expectFailure(() -> Main.normalizeArtist("  "));
        expectFailure(() -> Main.normalizeArtist("x".repeat(121)));
        check(Main.normalizeArtist("x".repeat(120)).length() == 120);
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
    private static void expectFailure(Runnable action) { try { action.run(); throw new AssertionError(); } catch (IllegalArgumentException expected) { } }
}
