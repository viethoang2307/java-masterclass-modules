import java.util.*;

public class Main {
    public static <T extends Number> double average(Collection<? extends T> values) {
        if (values.isEmpty()) throw new IllegalArgumentException("empty");
        double total = 0.0;
        for (T value : values) total += value.doubleValue();
        return total / values.size();
    }

    public static <T extends Number> double maxAsDouble(Collection<? extends T> values) {
        if (values.isEmpty()) throw new IllegalArgumentException("empty");
        double max = -Double.MAX_VALUE;
        for (T value : values) max = Math.max(max, value.doubleValue());
        return max;
    }

    public static void main(String[] args) {
        System.out.println(average(List.of(2, 4, 6)));
    }
}

