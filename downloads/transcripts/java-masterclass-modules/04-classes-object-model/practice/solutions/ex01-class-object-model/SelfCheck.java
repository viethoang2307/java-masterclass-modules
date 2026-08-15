public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Book book = new Main.Book(" Java ", 300);
        check(book.title().equals("Java"), "normalized title");
        check(book.pages() == 300, "initial pages");
        check(book.addPages(20), "positive add");
        check(book.pages() == 320, "updated pages");
        check(!book.addPages(0), "zero rejected");
        check(!book.addPages(-1), "negative rejected");
        boolean threw = false;
        try { new Main.Book("", 1); } catch (IllegalArgumentException ex) { threw = true; }
        check(threw, "blank rejected");
        System.out.println("PASS");
    }
}

