import java.util.*;

public class Main {
    public static final class Box<T> {
        private final T value;
        public Box(T value) { this.value = Objects.requireNonNull(value); }
        public T get() { return value; }
    }

    public static final class Pair<L, R> {
        private final L left;
        private final R right;
        public Pair(L left, R right) { this.left = left; this.right = right; }
        public L left() { return left; }
        public R right() { return right; }
        public <NL> Pair<NL, R> mapLeft(java.util.function.Function<? super L, ? extends NL> f) {
            return new Pair<>(f.apply(left), right);
        }
    }

    public static String describe(Box<?> box) {
        return String.valueOf(box.get());
    }

    public static void main(String[] args) {
        System.out.println(new Pair<>("id", 42).mapLeft(String::toUpperCase).right());
    }
}

