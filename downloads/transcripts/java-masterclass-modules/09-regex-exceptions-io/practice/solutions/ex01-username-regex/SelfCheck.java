public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        check(Main.valid("java_17"), "valid");
        check(!Main.valid("1java"), "first character");
        check(!Main.valid("ab"), "minimum");
        check(!Main.valid("java-name"), "character class");
        check(!Main.valid(null), "null");
        System.out.println("PASS");
    }
}

