public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.normalize("  Java 17 OOP ").equals("java-17-oop"), "normal");
        check(Main.normalize("A\tB\nC").equals("a-b-c"), "whitespace");
        check(Main.normalize("   ").equals(""), "blank");
        check(Main.normalize(null).equals(""), "null");
        check(Main.normalize("Already").equals("already"), "lower");
        System.out.println("PASS");
    }
}

