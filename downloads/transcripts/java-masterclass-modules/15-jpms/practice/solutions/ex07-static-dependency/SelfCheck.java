public class SelfCheck {
    public static void main(String[] args) {
        String d = "requires transitive common; requires static annotations;";
        check(Main.runtimeDirective(d, "common").equals("requires"));
        check(Main.runtimeDirective(d, "annotations").equals("requires static"));
        check(Main.runtimeDirective(d, "missing").equals("absent"));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
