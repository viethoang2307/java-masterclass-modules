import java.util.*;
import java.util.function.*;

public class Main {
    public static String normalize(String value) {
        Function<String, String> trim = String::trim;
        Function<String, String> lower = String::toLowerCase;
        return lower.compose(trim).apply(value);
    }

    public static int parsePositive(String value) {
        Function<String, Integer> parse = Integer::parseInt;
        int result = parse.andThen(Math::abs).apply(value.trim());
        if (result == 0) throw new IllegalArgumentException("zero");
        return result;
    }

    public static String orDefault(Optional<String> value, Supplier<String> fallback) {
        return value.orElseGet(fallback);
    }

    public static void main(String[] args) {
        System.out.println(normalize(" Java "));
    }
}

