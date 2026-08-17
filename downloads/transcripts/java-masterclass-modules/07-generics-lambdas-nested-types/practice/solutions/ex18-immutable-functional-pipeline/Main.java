import java.util.*;
import java.util.function.*;

public class Main {
    public static final class Pipeline<T> {
        private final List<T> values;
        private Pipeline(List<T> values) { this.values = List.copyOf(values); }
        public static <T> Pipeline<T> of(Collection<? extends T> values) {
            return new Pipeline<>(new ArrayList<>(values));
        }
        public Pipeline<T> filter(Predicate<? super T> rule) {
            List<T> filtered = values.stream().filter(rule).toList();
            return new Pipeline<T>(filtered);
        }
        public <R> Pipeline<R> map(Function<? super T, ? extends R> mapper) {
            List<R> mapped = values.stream().<R>map(mapper).toList();
            return new Pipeline<R>(mapped);
        }
        public List<T> toList() { return values; }
    }

    public static void main(String[] args) {
        System.out.println(Pipeline.of(List.of(1, 2, 3))
            .filter(value -> value > 1).map(Object::toString).toList());
    }
}
