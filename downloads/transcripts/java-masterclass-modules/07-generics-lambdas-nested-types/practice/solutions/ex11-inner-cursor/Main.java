import java.util.*;

public class Main {
    public static final class Notebook {
        private final List<String> lines;
        public Notebook(List<String> lines) { this.lines = List.copyOf(lines); }

        public final class Cursor {
            private int index;
            public boolean hasNext() { return index < lines.size(); }
            public String next() {
                if (!hasNext()) throw new NoSuchElementException();
                return lines.get(index++);
            }
        }

        public Cursor cursor() { return new Cursor(); }
        public int size() { return lines.size(); }
    }

    public static void main(String[] args) {
        Notebook n = new Notebook(List.of("one", "two"));
        Notebook.Cursor c = n.cursor();
        while (c.hasNext()) System.out.println(c.next());
    }
}

