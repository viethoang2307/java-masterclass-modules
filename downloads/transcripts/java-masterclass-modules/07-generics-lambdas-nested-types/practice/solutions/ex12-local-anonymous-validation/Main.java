import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static List<String> validate(String username) {
        class Rule {
            private final String message;
            private final Predicate<String> test;
            Rule(String message, Predicate<String> test) {
                this.message = message; this.test = test;
            }
            String check(String value) { return test.test(value) ? "" : message; }
        }

        Predicate<String> notBlank = new Predicate<>() {
            public boolean test(String value) {
                return value != null && !value.isBlank();
            }
        };
        List<Rule> rules = List.of(
            new Rule("required", notBlank),
            new Rule("min-length", value -> value != null && value.length() >= 3)
        );
        List<String> errors = new ArrayList<>();
        for (Rule rule : rules) {
            String error = rule.check(username);
            if (!error.isEmpty()) errors.add(error);
        }
        return List.copyOf(errors);
    }

    public static void main(String[] args) {
        System.out.println(validate("ab"));
    }
}

