public class Main {
    static final class Book {
        private final String title;
        private int pages;

        Book(String title, int pages) {
            if (title == null || title.isBlank() || pages < 0) {
                throw new IllegalArgumentException();
            }
            this.title = title.trim();
            this.pages = pages;
        }

        String title() { return title; }
        int pages() { return pages; }
        boolean addPages(int amount) {
            if (amount <= 0) return false;
            pages += amount;
            return true;
        }
    }

    public static void main(String[] args) {
        Book book = new Book("Java", 300);
        book.addPages(20);
        System.out.println(book.title() + ":" + book.pages());
    }
}

