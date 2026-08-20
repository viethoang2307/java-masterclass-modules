import java.util.Set;

public class SelfCheck {
    public static void main(String[] args) {
        String d = "module app { requires transitive common; requires static annotations; exports app.api to ui; exports app.spi; }";
        check(Main.requires(d).equals(Set.of("common", "annotations")));
        check(Main.exports(d).equals(Set.of("app.api", "app.spi")));
        System.out.println("PASS");
    }
    private static void check(boolean value) { if (!value) throw new AssertionError(); }
}
