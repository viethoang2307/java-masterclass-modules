import java.util.*;
import java.util.stream.*;

public class Main {
    public static <T> List<T> merge(Collection<? extends T> first,
                                    Collection<? extends T> second) {
        return Stream.concat(first.stream(), second.stream()).toList();
    }

    public static List<Integer> powersOfTwo(int count) {
        return Stream.iterate(1, value -> value * 2).limit(count).toList();
    }

    public static void main(String[] args) {
        System.out.println(merge(List.of("a"), List.of("b", "c")));
    }
}

