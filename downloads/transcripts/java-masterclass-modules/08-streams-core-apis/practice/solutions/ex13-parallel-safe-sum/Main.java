import java.util.*;

public class Main {
    public static long safeSum(List<Long> values) {
        return values.parallelStream().mapToLong(Long::longValue).sum();
    }

    public static long sequentialSum(List<Long> values) {
        return values.stream().mapToLong(Long::longValue).sum();
    }

    public static void main(String[] args) {
        System.out.println(safeSum(List.of(1L, 2L, 3L)));
    }
}

