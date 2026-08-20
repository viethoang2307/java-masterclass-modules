import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) throws Exception {
        check(Main.parse("port=8080").get("port") == 8080, "parse");
        boolean failed = false;
        try { Main.parse("port=x"); } catch (Main.ConfigException ex) { failed = true; }
        check(failed, "number");
        try { Main.parse(null); } catch (Main.ConfigException ex) { failed = true; }
        check(failed, "null");
        System.out.println("PASS");
    }
}

