public class SelfCheck {
    public static void main(String[] args) {
        check(Main.normalize("  ADD   ARTIST   Hà Nội ").equals("ADD ARTIST Hà Nội"));
        try { Main.normalize(" \t "); throw new AssertionError(); } catch (IllegalArgumentException expected) { }
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
