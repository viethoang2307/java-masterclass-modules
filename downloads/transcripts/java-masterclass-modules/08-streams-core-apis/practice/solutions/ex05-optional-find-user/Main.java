import java.util.*;

public class Main {
    public record User(String id, String displayName, boolean active) {}

    public static Optional<String> findActiveName(List<User> users, String id) {
        return users.stream()
            .filter(Objects::nonNull)
            .filter(User::active)
            .filter(user -> user.id().equals(id))
            .map(User::displayName)
            .filter(name -> name != null && !name.isBlank())
            .findFirst();
    }

    public static void main(String[] args) {
        System.out.println(findActiveName(
            List.of(new User("u1", "An", true)), "u1"));
    }
}

