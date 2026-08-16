import java.util.*;

public class Main {
    @SafeVarargs
    public static <T> List<T> flatten(List<? extends T>... parts) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> part : parts) result.addAll(part);
        return List.copyOf(result);
    }

    public static <T> T[] copyWithFactory(T[] input, java.util.function.IntFunction<T[]> factory) {
        T[] result = factory.apply(input.length);
        System.arraycopy(input, 0, result, 0, input.length);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(flatten(List.of("a"), List.of("b", "c")));
    }
}

