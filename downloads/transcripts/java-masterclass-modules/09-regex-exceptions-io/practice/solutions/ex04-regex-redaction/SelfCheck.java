public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        check(Main.redact("mail an@example.com").equals("mail an***@example.com"), "redact");
        check(Main.redact("none").equals("none"), "unchanged");
        check(Main.redact(null).equals(""), "null");
        System.out.println("PASS");
    }
}

