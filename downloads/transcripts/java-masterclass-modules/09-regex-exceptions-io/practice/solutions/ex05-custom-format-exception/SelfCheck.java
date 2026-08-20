public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) throws Exception {
        check(Main.parsePositive("42") == 42, "valid");
        boolean format = false;
        try { Main.parsePositive("x"); }
        catch (Main.FormatException ex) { format = ex.getCause() instanceof NumberFormatException; }
        check(format, "cause");
        boolean positive = false;
        try { Main.parsePositive("0"); } catch (Main.FormatException ex) { positive = true; }
        check(positive, "positive");
        System.out.println("PASS");
    }
}

