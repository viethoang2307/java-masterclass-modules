public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        check(Main.sumCsv("1, 2, 3") == 6, "sum");
        check(Main.sumCsv("") == 0, "empty");
        boolean failed = false;
        try { Main.sumCsv("1,x"); } catch (IllegalArgumentException ex) { failed = true; }
        check(failed, "invalid");
        System.out.println("PASS");
    }
}

