public class Main {
    static final class Printer {
        private int toner;
        private int pagesPrinted;
        Printer(int toner) {
            if (toner < 0 || toner > 100) throw new IllegalArgumentException();
            this.toner = toner;
        }
        boolean addToner(int amount) {
            if (amount <= 0) return false;
            toner = Math.min(100, toner + amount);
            return true;
        }
        boolean print(int pages) {
            if (pages <= 0 || pages > toner) return false;
            toner -= pages;
            pagesPrinted += pages;
            return true;
        }
        int toner() { return toner; }
        int pagesPrinted() { return pagesPrinted; }
    }

    public static void main(String[] args) {
        Printer printer = new Printer(10);
        printer.print(3);
        System.out.println(printer.toner());
    }
}

