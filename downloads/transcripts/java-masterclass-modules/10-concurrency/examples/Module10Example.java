import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Module10Example {
    public static void main(String[] args) throws Exception {
        AtomicInteger completed = new AtomicInteger();
        try (ExecutorService pool = Executors.newFixedThreadPool(2)) {
            List<Future<Integer>> futures = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                int value = i;
                futures.add(pool.submit(() -> {
                    completed.incrementAndGet();
                    return value * value;
                }));
            }
            for (Future<Integer> future : futures) System.out.println(future.get());
        }
        System.out.println("completed=" + completed.get());
    }
}