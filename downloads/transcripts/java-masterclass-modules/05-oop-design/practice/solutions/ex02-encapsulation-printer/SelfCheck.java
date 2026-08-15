public class SelfCheck {
    private static void check(boolean ok, String message) {
        if (!ok) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        Main.Printer p = new Main.Printer(10);
        check(p.print(3), "print");
        check(p.toner() == 7 && p.pagesPrinted() == 3, "accounting");
        check(!p.print(8), "insufficient toner");
        check(p.addToner(100) && p.toner() == 100, "clamp");
        check(!p.addToner(0), "invalid add");
        boolean threw = false;
        try { new Main.Printer(101); } catch (IllegalArgumentException ex) { threw = true; }
        check(threw, "invalid initial");
        System.out.println("PASS");
    }
}

