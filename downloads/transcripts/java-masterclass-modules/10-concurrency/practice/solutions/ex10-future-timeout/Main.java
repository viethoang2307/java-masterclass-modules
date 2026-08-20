import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Main {
    public static boolean cancelled() throws Exception {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        Future<String> future = pool.submit(() -> {
            Thread.sleep(1_000);
            return "late";
        });
        try {
            future.get(20, TimeUnit.MILLISECONDS);
            return false;
        } catch (TimeoutException expected) {
            return future.cancel(true) && future.isCancelled();
        } finally {
            pool.shutdownNow();
            pool.awaitTermination(500, TimeUnit.MILLISECONDS);
        }
    }
}
