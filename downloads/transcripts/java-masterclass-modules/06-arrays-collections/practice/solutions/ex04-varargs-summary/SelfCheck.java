public class SelfCheck {
    public static void main(String[] args) {
        Main.Summary s = Main.summarize(" | ", " Java ", "", "Map");
        check(s.count() == 2 && s.text().equals("Java | Map"));
        check(Main.summarize(",").text().isEmpty());
        System.out.println("PASS");
    }
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
}
