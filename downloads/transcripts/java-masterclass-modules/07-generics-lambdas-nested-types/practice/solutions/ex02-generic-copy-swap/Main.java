import java.util.*;

public class Main {
    public static <T> void swap(List<T> values, int a, int b) {
        T temp = values.get(a);
        values.set(a, values.get(b));
        values.set(b, temp);
    }

    public static <T> void copyTo(List<? super T> target, List<? extends T> source) {
        for (T value : source) target.add(value);
    }

    public static void main(String[] args) {
        List<Number> target = new ArrayList<>();
        copyTo(target, List.of(1, 2, 3));
        System.out.println(target);
    }
}

