import java.util.*;
public class SelfCheck {
    static void check(boolean ok, String message) { if (!ok) throw new AssertionError(message); }
    public static void main(String[] args) {
        Main.User user = new Main.User("u1", Optional.of(
            new Main.Profile(Optional.of(new Main.City("Hanoi")))));
        Main.User noCity = new Main.User("u2", Optional.of(new Main.Profile(Optional.empty())));
        List<Main.User> users = List.of(user, noCity);
        check(Main.cityOf(users, "u1").orElseThrow().equals("Hanoi"), "nested");
        check(Main.displayCity(users, "u2").equals("unknown"), "fallback");
        System.out.println("PASS");
    }
}

