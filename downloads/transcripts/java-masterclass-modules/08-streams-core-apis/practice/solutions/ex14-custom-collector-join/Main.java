import java.util.*;
import java.util.stream.*;

public class Main {
    public static String joinUpper(List<String> values) {
        return values.parallelStream().collect(
            StringBuilder::new,
            (builder, value) -> {
                if (builder.length() > 0) builder.append('|');
                builder.append(value.toUpperCase(Locale.ROOT));
            },
            (left, right) -> {
                if (left.length() > 0 && right.length() > 0) left.append('|');
                left.append(right);
            }).toString();
    }

    public static void main(String[] args) {
        System.out.println(joinUpper(List.of("java", "stream")));
    }
}

