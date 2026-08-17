import java.util.*;

public class Main {
    public static <T> int transfer(List<? super T> target, List<? extends T> source) {
        int count = 0;
        for (T item : source) {
            target.add(item);
            count++;
        }
        return count;
    }

    public static <T> List<T> snapshot(List<? extends T> source) {
        return new ArrayList<>(source);
    }

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        System.out.println(transfer(objects, List.of("a", "b")));
    }
}

