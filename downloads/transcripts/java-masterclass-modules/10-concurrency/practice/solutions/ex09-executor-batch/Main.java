import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static int[] squares(int size) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(4);
        try {
            List<Future<Integer>> futures = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                final int value = i;
                Callable<Integer> task = () -> value * value;
                futures.add(pool.submit(task));
            }
            int[] result = new int[size];
            for (int i = 0; i < size; i++) result[i] = futures.get(i).get();
            return result;
        } finally {
            pool.shutdownNow();
        }
    }
}
