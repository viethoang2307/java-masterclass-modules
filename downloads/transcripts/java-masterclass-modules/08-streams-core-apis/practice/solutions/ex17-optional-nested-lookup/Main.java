import java.util.*;

public class Main {
    public record City(String name) {}
    public record Profile(Optional<City> city) {}
    public record User(String id, Optional<Profile> profile) {}

    public static Optional<String> cityOf(List<User> users, String id) {
        return users.stream()
            .filter(user -> user.id().equals(id))
            .findFirst()
            .flatMap(User::profile)
            .flatMap(Profile::city)
            .map(City::name);
    }

    public static String displayCity(List<User> users, String id) {
        return cityOf(users, id).orElseGet(() -> "unknown");
    }

    public static void main(String[] args) {
        System.out.println(displayCity(List.of(), "none"));
    }
}

