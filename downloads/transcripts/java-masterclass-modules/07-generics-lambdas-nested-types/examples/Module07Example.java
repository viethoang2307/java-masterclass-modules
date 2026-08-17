import java.util.*;
import java.util.function.Function;

public class Module07Example {
    static <T, R> List<R> map(List<? extends T> source,
                              Function<? super T, ? extends R> mapper) {
        return source.stream().map(mapper).toList();
    }
    public static void main(String[] args) {
        System.out.println(map(List.of("a", "bb"), String::length));
    }
}