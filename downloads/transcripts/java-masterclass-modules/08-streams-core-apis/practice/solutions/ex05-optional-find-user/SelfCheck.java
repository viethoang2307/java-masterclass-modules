import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        List<Main.User> users = Arrays.asList(
            new Main.User("u1", "An", true),
            new Main.User("u2", "Binh", false),
            new Main.User("u3", null, true));
        check(Main.findActiveName(users, "u1").orElseThrow().equals("An"), "found");
        check(Main.findActiveName(users, "u2").isEmpty(), "inactive");
        check(Main.findActiveName(users, "u3").isEmpty(), "blank name");
        System.out.println("PASS");
    }
}

