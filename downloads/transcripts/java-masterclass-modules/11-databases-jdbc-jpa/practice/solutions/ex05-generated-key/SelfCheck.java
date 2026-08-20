public class SelfCheck {
    public static void main(String[] args) {
        if (Main.firstKey(new long[]{42, 43}) != 42) throw new AssertionError();
        try { Main.firstKey(new long[0]); throw new AssertionError(); }
        catch (IllegalStateException expected) { }
        System.out.println("PASS");
    }
}
