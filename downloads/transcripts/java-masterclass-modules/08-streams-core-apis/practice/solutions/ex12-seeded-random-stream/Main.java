import java.util.*;
import java.util.stream.*;

public class Main {
    public static List<Integer> dice(Random random, int count) {
        if (count < 0) throw new IllegalArgumentException("count");
        return random.ints(count, 1, 7).boxed().toList();
    }

    public static int total(Random random, int count) {
        return dice(random, count).stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        System.out.println(dice(new Random(42), 5));
    }
}

