public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        check(Main.trace().equals("color-int|string"), "dispatch trace");
        Main.Printer printer = new Main.ColorPrinter();
        check(printer.print(1).equals("color-int"), "override");
        check(printer.print("x").equals("string"), "inherited overload");
        System.out.println("PASS");
    }
}

