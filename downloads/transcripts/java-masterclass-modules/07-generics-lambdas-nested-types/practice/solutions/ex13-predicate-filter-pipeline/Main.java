import java.util.*;
import java.util.function.Predicate;

public class Main {
    public record User(String id, boolean active, int age, String email) {}

    public static List<User> eligible(List<User> users, int minimumAge) {
        Predicate<User> nonNull = Objects::nonNull;
        Predicate<User> active = user -> user.active();
        Predicate<User> oldEnough = user -> user.age() >= minimumAge;
        Predicate<User> hasEmail = user -> user.email() != null && user.email().contains("@");
        Predicate<User> rule = nonNull.and(active).and(oldEnough).and(hasEmail);
        return users.stream().filter(rule).toList();
    }

    public static void main(String[] args) {
        System.out.println(eligible(List.of(new User("u1", true, 20, "a@x")), 18));
    }
}

