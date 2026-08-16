import java.util.*;

public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Notebook notebook = new Main.Notebook(List.of("one", "two"));
        Main.Notebook.Cursor cursor = notebook.cursor();
        check(cursor.hasNext() && "one".equals(cursor.next()), "first");
        check(cursor.hasNext() && "two".equals(cursor.next()), "second");
        check(!cursor.hasNext(), "end");
        boolean failed = false;
        try { cursor.next(); } catch (NoSuchElementException expected) { failed = true; }
        check(failed, "cursor invariant");
        System.out.println("PASS");
    }
}

