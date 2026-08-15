public class Main {
    static class Printer {
        String print(int value) { return "int"; }
        String print(String value) { return "string"; }
    }

    static final class ColorPrinter extends Printer {
        @Override String print(int value) { return "color-int"; }
    }

    static String trace() {
        Printer printer = new ColorPrinter();
        return printer.print(1) + "|" + printer.print("x");
    }

    public static void main(String[] args) {
        System.out.println(trace());
    }
}

