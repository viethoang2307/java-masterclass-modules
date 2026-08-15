public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        String expected = "Name: An\nScore: 82\n";
        check(Main.report(new Main.Student("An", 82)).equals(expected), "text block");
        check(Main.report(new Main.Student("Binh", 0)).equals("Name: Binh\nScore: 0\n"), "zero");
        System.out.println("PASS");
    }
}

